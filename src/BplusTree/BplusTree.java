package BplusTree;

import serialization.SerDeserializer;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;

//import com.mj.db.serialization.SerDeserializer;


/**
 * B+ tree
 * First implementation with integer key
 * @author manoj
 *
 */

@SuppressWarnings("unused")
public class BplusTree<T> {

	private final int BLOCK_SIZE = 1024 ; // bytes
	// private final int BLOCK_SIZE = 128 ;
	// private final int BLOCK_SIZE = 256 ;
	private final int VALUE_SIZE = 8 ; //long
	
	private int keysize ;
	
	private RandomAccessFile treeStore ;
	
	private BplusNode<T> root = null ;
	
	private int nextBlockPointer = 0 ;
	
	private boolean newtree = false ;
	
	private SerDeserializer<T> keySerDeser ;
	private Comparator<T> keyComparator ;
	
	private int M = 0 ;
	
	
	private BplusTree() {
		
		
	}
	
	
	public BplusTree(String filename, int keysize, int recordsize,
					 SerDeserializer<T> sd, Comparator<T> kc) throws IOException {


		File f = new File(filename) ;

		newtree = !f.exists();
		
		keySerDeser = sd ;
		keyComparator = kc ;
		
		this.keysize = keysize ;
		
		M = (BLOCK_SIZE - 14)/( keysize + VALUE_SIZE) ;
		
		treeStore = new RandomAccessFile(filename,"rw") ;
		
		
		
		// if (newtree) {
		//	createmetadata() ;
		// } else
			load() ;

	}
	
	protected int getNumKeysPerBlock() {
		
		return M ;
	}
	
	public SerDeserializer<T> getSerDeserializer() {
		
		return keySerDeser ;
	}
	
	public Comparator<T> getKeyComparator() {
		
		return keyComparator ;
	}
	
	public long find(T key) {
		if(root == null){
			return 0;
		}
		else {
			return root.find(key);
		}
	}
	
	public byte[] getNext() {
		
		
		
		return null ;
	}
	
	
	public void insert(T key, long value) {
		
		BplusNode<T> node = null ;
		
		if (root == null) {
			node = new BplusNode<T>(this) ;
			root = node ;
			node.setRoot(true) ;
			node.setLeaf(true) ;
		}
		
		BplusNode<T> newchild = root.insert(key, value) ;
		
		// if a child is returned , it means root was split
		// we need to create a new nonleaf root
		if (newchild != null) {
			
			BplusNode<T> newnode = new BplusNode<T>(this) ;
			newnode.setRoot(true) ;
			newnode.setLeaf(false) ;
			root.setRoot(false) ;
			root.moveBlock() ;
			newnode.addChildren(root,newchild) ;  
			// int promotedkey = newnode.getPromotedKey() ;
			// int ptr = newchild.getPointer() ;
			// newnode.insert(promotedkey, ptr) ;
			newnode.writetoDisk() ;
			
			root = newnode ;
		}
		
	}
	
	public void delete(T key) {
		
		root.delete(key) ;
	}
	
	public BplusNode<T> readFromDisk(int blockpointer) throws IOException {
		
				
		treeStore.seek(blockpointer*BLOCK_SIZE) ;
		
		
		int freeornot = treeStore.readByte() ;
		
		if (freeornot == 1) { // valid block
		
			byte[] b = new byte[BLOCK_SIZE-1] ;
		
			treeStore.readFully(b, 0, BLOCK_SIZE-1) ;
				
			return new BplusNode<T>(this,b,blockpointer) ;
		} 
			return null ;
	}
	
	public void writeToDisk(BplusNode<T> node) throws IOException {
		
		int pointer = node.getPointer() ;
		treeStore.seek(pointer*BLOCK_SIZE) ;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(BLOCK_SIZE) ;
		DataOutputStream ds = new DataOutputStream(bos) ;
		
		if (node.isLeaf())
			node.writeLeaf(ds) ;
		else
			node.writeNonLeaf(ds) ;
		
		int recsize = bos.size() ;
		int fill = BLOCK_SIZE-recsize ;
		
		for (int i = 1 ; i <= fill ;i ++) {
			
			bos.write(0) ;
		}
		   
		byte[] record = bos.toByteArray() ;
		
		if (record.length != BLOCK_SIZE) {
            node.printNode();
            throw new RuntimeException("rec size= " + record.length + " block size=" + BLOCK_SIZE);
        }
		
		
		treeStore.write(record) ;
		
		
	}
	
	public void close(){
		try {
			treeStore.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public long getFilePointer() throws IOException {
		
		return treeStore.getFilePointer() ;
	}
	
	public int getNextBlockPointer() {
		
		int next = nextBlockPointer ;
		nextBlockPointer++ ;
		return next ;
	}
	
	public void decNextBlockPointer() {
		
		if (nextBlockPointer > 1)
			nextBlockPointer-- ;
	}
	
	public boolean isTreeValid() throws IOException {
		
				
		if (root == null) {
			System.out.println("Root is null. Tree is empty") ;
			return true ;
		}
		
			
		// Breadth first traverse
		
		ArrayDeque<NodeBounds<T>> queue = new ArrayDeque<NodeBounds<T>>() ;
		
		
		queue.addAll(root.getChildrenNodeBounds()) ;
		
		NodeBounds<T> current = null ; 
		while( !queue.isEmpty() && (current = queue.poll()) != null) {
			
			BplusNode<T> cNode = readFromDisk(current.blockpointer) ;
			
			if (cNode.isNodeValid(current.low, current.high))
				queue.addAll(cNode.getChildrenNodeBounds()) ;
			else
				return false ;
			
		}
		
		
		
		
		return true ;
	}
	
	public long[] traverse(){
		if (root == null){
			System.out.println("Root is null.");
			return null;
		}

		ArrayList<Long> values;
		if(root.isLeaf()){
			values = root.getData();
		}
		else {
			values = new ArrayList<>();
			ArrayDeque<Integer> queue = new ArrayDeque<>();

			queue.addAll(root.getChildren());
			Integer current = null;
			while (!queue.isEmpty() && (current = queue.poll()) != null){
				BplusNode<T> cNode = null;
				try {
					cNode = readFromDisk(current);
				} catch (IOException e) {
					e.printStackTrace();
				}
				ArrayList<Long> curVals = cNode.getData();
				values.addAll(curVals);
				queue.addAll(cNode.getChildren()) ;
			}
		}
		long[] ans = new long[values.size()];
		for (int i = 0; i < values.size(); ++i){
			ans[i] = values.get(i);
		}
		return ans;
	}
	
	public void printTree() throws IOException {
		
		
		if (root == null) {
			System.out.println("Root is null. Tree is empty") ;
			return ;
		}
		
	
		
		// Breadth first traverse
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>() ;
		
		root.printNode() ;
		
		queue.addAll(root.getChildren()) ;
		

		
		Integer current = null ; 
		while( !queue.isEmpty() && (current = queue.poll()) != null) {
			
			BplusNode<T> cNode = readFromDisk(current) ;
			cNode.printNode() ;
			queue.addAll(cNode.getChildren()) ;
			
		}
		
	}
	
	private void load() throws IOException {
		
		try {
			
			long filesize = treeStore.length() ;
			int numblocks = (int)filesize/ this.BLOCK_SIZE ;
			
			nextBlockPointer = numblocks  ;
			root = readFromDisk(0) ;
			
		} catch(EOFException e) {
			root = null ;
		}
	}
	
	public void printBlock(int i) {
		
		
		
		
	}
	
}