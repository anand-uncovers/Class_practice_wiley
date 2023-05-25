package basics_java_02;

class A{
    public void add1(){
        System.out.println("Add A");
    }
    public void sub1(){
        System.out.println("Sub A");
    }
}
class B extends A{
    public void sub1(){
        System.out.println("Sub B");
    }
    public void mul1(){
        System.out.println("Mul B");
    }
    
}
class D extends B{
    public void mul1(){
        System.out.println("Mul D");
    }
    public void div1(){
        System.out.println("Div D");
    }
}
class E extends D{
    public void div1(){
        System.out.println("Div E");
    }
}
class C extends A{
    public void add1(){
        System.out.println("Add C");
    }
}
public class HybridInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        C c= new C();
        c.add1();
        c.sub1();
        D d = new D();
        d.mul1();
        E e = new E();
        e.add1();
   }
    
}
