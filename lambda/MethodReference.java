package lambda;


interface Sayable{
	void say();
}
interface  GetInfo{
	Info getMsg(String str);
}
class Info{
	Info(String msg){
		System.out.println(msg);
	}
}


public class MethodReference {

	public void hello() {
		System.out.println("Hello for this instance method.");
	}
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}
	
	public static void processSomething() {
		System.out.println("Processing...");
	}
	
	public static void main(String[] args) {
		
		GetInfo info =Info::new;
		info.getMsg("my message Aastha...");
		
		MethodReference mt = new MethodReference();
		Sayable isv = mt::hello;
		isv.say();
		
		
		Sayable sayable = MethodReference::saySomething;
		//Calling interface method
		sayable.say();//processing hello
		
		Thread t1 = new Thread(MethodReference::processSomething);
		t1.start();
		

		

	}

}
