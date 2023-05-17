package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

	public static void main(String[] args) {
		//Printer printer = new Printer("Wiley");
		//printer.print();
		
		//Printer<Cat> printer = new Printer(new Cat());
		//printer.print();
		
		//Printer<Dog> printer = new Printer(new Dog());
		//printer.print();
		
		//ArrayList<Object> cats = new ArrayList<>();
		//cats.add(new Cat());
		//cats.add(new Cat());
	   // cats.add(new Dog());
		
		//shout("Take me to movie");
	//	shout("bring necklace");
	//	shout(20000000000);
		//shout(new Dog());
		//shout("Amount",200000);
		//shout()
		
		List<Integer>intList = new ArrayList<>();
		intList.add(3);
		printList(intList);
		
		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printList(catList);

	}
	
	private static void  printList(List<?>myList) {
		//System.out.println(shoutOut+"...!!!!");
		//System.out.println(valtoBring+"...!!!!");
		
		//return shoutOut;
		System.out.println(myList);
	}
	private static <T, V> T shout(T shoutOUt, V valtoBring ) {
		System.out.println(shoutOUt + " ...!!!!");
		System.out.println(valtoBring + " ...!!!!");
		
		return shoutOUt;
	}

}
