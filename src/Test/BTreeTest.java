package Test;

import BplusTree.BplusTree;
import Utils.IntegerComparator;
import serialization.IntegerSerDeser;

import java.io.IOException;
import java.util.Arrays;

public class BTreeTest {
    public static void main(String[] strings) throws IOException {
        BplusTree<Integer> tree = new BplusTree<Integer>("test.txt", 4, 128, new IntegerSerDeser(), new IntegerComparator());
//        tree.insert(12, 12);
//        tree.insert(13, 13);
//        tree.insert(14, 14);
//        tree.insert(15, 15);
        long[] pos = tree.traverse(null, null);
        System.out.println(Arrays.toString(pos));

        tree.delete(12);
        tree.delete(13);
        pos = tree.traverse(null, null);
        System.out.println(Arrays.toString(pos));
    }
}
