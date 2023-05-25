package JavaThreads;

public class DeadLockConcept {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		LockThread lt1 = new LockThread();
		lt1.start();

	}
	
	private static class LockHead extends Thread{
		public void run() {
			synchronized(Lock){
				System.out.println("Thread one hold:Lock1");
				try {
					
				}catch() {
					
				}
			}
		}
	}

}
