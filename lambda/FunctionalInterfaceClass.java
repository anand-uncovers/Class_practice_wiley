package lambda;

@FunctionalInterface
interface Calc{
	//Abstract Method
	int calculate(int val);
}
public class FunctionalInterfaceClass {
     public static void main(String[] args) {
	 
    	 //let's implement abstract method of the Calc interface
    	 Calc c2 = (int val) -> val + 54;
    	 
    	 //Call the method
    	 System.out.println("Result : "+ c2.calculate(54));
   }
}
