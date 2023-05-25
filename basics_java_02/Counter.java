package basics_java_02;

public class Counter {

	private static int count=0;
	private final String name;
	
    public Counter(String name) {
    	this.name= name;
    }
    public synchronized void increment() {//oone thread at a time
    	count++;
    	
    }
    public int getCount() {
    	return count;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
