package basics_java_01;
import java.util.ArrayList;


public class Cart {
	
	public static void main(String[] args) {
		

	     ArrayList<Integer> list = new ArrayList<>();
	     list.add(2340);
	     list.add(3457);
	     list.add(8975);

	     int sum=0;
	     int n=list.size();

	     for(int i=0;i<n;i++){
	        sum+=list.get(i);
	     }

	     int discount= (10*sum)/100;
	     int bill=0;

	     if(sum>15000)
	     bill =sum-discount;
	     else 
	     bill =sum;

	     System.out.println("The bill of customer is:"+bill);
	     


	}

}
