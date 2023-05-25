package basics_java_02;

public class CompileTimepolymorphism {
	 public void pet(int a){
	        System.out.println(a);
	    }
	    public void pet(double b){
	        System.out.println(2*b);
	    }
	    public static void main(String[] args) {
	       CompileTimepolymorphism ct = new CompileTimepolymorphism();
	       System.out.println("First method ");
	       ct.pet(2);
	        System.out.println("Second method ");
	       ct.pet(2.0);
	    }

}
