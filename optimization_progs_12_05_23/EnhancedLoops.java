package optimization_progs_12_05_23;

public class EnhancedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,2,3,4,5};
		
		for(var  i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//Efficient way of using regular for loop
		int[]array1= {1,2,3,4,5};
		for(int num:array) {
			System.out.println(num);
		}
	}

}
