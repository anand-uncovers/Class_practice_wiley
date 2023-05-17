package optimization_progs_12_05_23;

public class StrengthReduction {

	public static void main(String[] args) {
		StrengthReduction strred=new StrengthReduction();
		strred.calcSum(7);
		

	}
	
	//public int calcSum(int[]array) {
	//	int sum=0;
		
	//	for(int i=0;i<array.length;i++) {
	//		sum+=array[i];
	//	}
	//	return sum*sum;
	//}
	
	public int calcTotal(int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=i*5;
		}
		return sum;
	}

}
