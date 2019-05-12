package BplusTree;

import Utils.Bytes;
import Utils.Log;

import java.nio.ByteBuffer;

public abstract class Node {
    protected byte[] header;
    protected byte[] keys;
    protected byte[] pointers;

    Node parent;

    /**
     * Base constructor for Node.
     * @param ID - the ID of the Node (i.e the block number storing the Node)
     */
    public Node(int ID){
        this.header = new byte[9];
        Bytes.intToBytes(ID, this.header, 0);
    }

    /**
     * Constructor for Node
     * @param ID - - the ID of the Node (i.e the block number storing the Node)
     * @param isLeaf - true if the Node is a LeafNode, else false
     */
    public Node(int ID, boolean isLeaf){
        this(ID);
        this.header[4] = Bytes.booleanToByte(isLeaf);
    }

    public Node(){}

    public int getID(){
        return Bytes.bytesToInt(this.header, 0);
    }

    public boolean isLeaf(){
        return Bytes.byteToBoolean(this.header[4]);
    }

    public void setParent(Node parent){
        if(parent != null){
            this.parent = parent;
        }else{

        }
    }

    public int getParent(){
        if(this.parent != null ) {
            return this.parent.getID();
        }
        return 0;
    }

    public byte[] getKeys(){
        return this.keys;
    }

    public void setKeys(byte[] keys){
        if(keys.length > this.keys.length + BplusTree.getKeySize()){
            throw new IndexOutOfBoundsException("Tried to set keys with size " + keys.length + ".");
        }
        this.keys = keys;
    }

    public byte[] getPointers(){
        return this.pointers;
    }

    public void setPointers(byte[] pointers){
        if(pointers.length > this.pointers.length + BplusTree.getPointerSize()){
            // pointer byte array larger than what is allowed
            throw new IndexOutOfBoundsException("Tried to set pointers with size " + pointers.length + ".");
        }
        this.pointers = pointers;
    }

    public boolean isRoot(){
        return this.parent == null;
    }

    public int getOrder(){
        return BplusTree.getOrder();
    }

    /**
     * Method used for converting the Node data object to a byte array for storage to {@code RandomAccessFile}.
     * @return the byte representation of the header, keys and pointers of this node
     */
    public byte[] toBytes(){
        ByteBuffer bb = ByteBuffer.allocate(BplusTree.getBlockSize());
        bb.put(this.header);
        // Store the keys except for the last four extra bytes
        for(int i = 0; i < this.keys.length - 4; i += 4){
            bb.putInt(Bytes.bytesToInt(this.keys, i));
        }
        // Store the pointers except for the last four extra bytes
        for(int i = 0; i < this.pointers.length - 4;i += 4){
            bb.putInt(Bytes.bytesToInt(this.pointers, i));
        }
        byte[] result = bb.array();
        bb.clear();
        return result;
    }
}
