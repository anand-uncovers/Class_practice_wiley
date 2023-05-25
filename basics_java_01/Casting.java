package basics_java_01;

public class Casting {

	public static void main(String[] args) {
		 int myInt = 9;
	        double myDouble= myInt;//Automatic casting

	        System.out.println(myDouble);
	        System.out.println(myInt);

	        System.out.println("Earlier we saw automatic casting");

	        double myDoublenew= 54.45d;
	        int myIntnew=(int)myDouble;//Manual casting

	        System.out.println(myDoublenew);
	        System.out.println(myIntnew);

	        System.out.println("Here we saw manual casting");

	        char c='a';
	        c++;
	        System.out.println(c);


	}

}
