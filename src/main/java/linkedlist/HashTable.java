package linkedlist;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        hashtable.put(123, 432);
        hashtable.put(12, 2345);
        hashtable.put(15, 5643);
        hashtable.put(3, 321);

        hashtable.remove(12);
        hashtable.remove(100);

        System.out.println(hashtable);
    }
}
