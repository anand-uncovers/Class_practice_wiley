package optimization_progs_12_05_23;

public class DeadCodeElimination {
	
	public  void printOperation(int value) {
		if(value>0) {
			System.out.println("value is positive");
		}else {
			System.out.println("value is not present");
		}
		//System.out.println("Not reachable");
	}
	

	public static void main(String[] args) {
		DeadCodeElimination dc=new DeadCodeElimination();
		dc.printOperation(6);
	}

}
