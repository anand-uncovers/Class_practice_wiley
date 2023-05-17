package basics_java_02;

class A{
    public void add1(){
        System.out.println("Add A");
    }
    public void sub1(){
        System.out.println("Sub A");
    }
}
class B extends A{//Hierarchial
    public void sub1(){
        System.out.println("Sub B");
    }
    public void mul1(){
        System.out.println("Mul B");
    }
    
}
class C extends A{//Hierarchial
    public void add1(){
        System.out.println("Add C");
    }
}
public class HierarchialInheritance {
	 public static void main(String args[]){
	       A a= new A();
	       a.add1();
	       B b =new B();
	       b.sub1();
	       b.add1();
	       C c=new C();
	       c.add1();

	    }

}
