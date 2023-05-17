package basics_java_02;

public class InstanceOrder {
    String name;
    int age;

    {
        name="Aastha";
        age=20;
        System.out.println("Instance Block");
    }
    public InstanceOrder(){
        System.out.println("Name: "+name+ " Age: "+age);
        System.out.println("Constructor block");
    }
    public InstanceOrder(int a, int b){
        System.out.println("constructor parameterized"+ (a+b));
    }
    public static void main(String[]args){
        InstanceOrder ior = new InstanceOrder();
        new InstanceOrder (2,3);
    }
}
