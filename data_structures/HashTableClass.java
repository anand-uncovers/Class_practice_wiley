package data_structures;

import java.util.*;


public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<Integer,Integer>ht = new Hashtable<>();
	
	//	HashTableClass ht= new HashTableClass();
		ht.put(123,  432);
		ht.put(12, 2345);
		ht.put(15, 5643);
		ht.put(3, 121);
		ht.remove(12);
		System.out.println(ht);

	}

}
