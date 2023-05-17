package optimization_progs_12_05_23;


//Lazy initialization
public class DefineClass {
//Inefficient way of creating object immediately
	//private Object DefineClass= new Object(;
	private Object myObject;
	
	public Object getMyObject() {
		if(myObject==null) {
			myObject=new Object();
		}
		return myObject;
	}
	
	public static void main(String[] args) {
		

	}

}
