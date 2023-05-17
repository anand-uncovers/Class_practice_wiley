package lambda;

public class LambdaClass {

	static String printThing(Printable thing) {
		return thing.print(" Edge");
	}
	//static void printThing(Printable thing) {
	//	thing.print("!");
	//}
	public static void main(String[] args) {
		//Product myProd = new Product();
	//	printThing(myProd);
		//printThing(() -> System.out.println("This is a lambda expression"));

		
		// Printable lambdaPrinciple=(s)->System.out.println("Expression"+s);
		// printThing(lambdaPrinciple);
	     
		Printable lambdaPrinciple = s -> {
			return "Wiley" + s ;
		};
		System.out.println(printThing(lambdaPrinciple));
	}

}
