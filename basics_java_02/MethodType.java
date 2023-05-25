package basics_java_02;

public class MethodType {
    
    public void sub(int v1, int v2){

    }
    public void add(int v1, int v2){
        int val=v1+v2;
        System.out.println("Addition in instance method:- "+val);
    }
    public static void mul (int v1, int v2){
        int val=v1*v2;
        System.out.println("Multiplication in static method:-"+val);
    }
    public static void main(String[] args){
        mul(26,26);
        MethodType mt= new MethodType();
        mt.mul
        
    }
}
