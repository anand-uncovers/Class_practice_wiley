package basics_java_01;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Please enter the number:");
	        int n=sc.nextInt();

	        System.out.println("for loop---------------------");
	        
	        for(int i=0;i<n;i++){
	            System.out.println("The value of i:"+i);
	            for(int j=0;j<n;j++){
	                System.out.println("Value of j:"+j);
	            }
	            System.out.println("--------------------");
	        }
	int num;
	        System.out.println("while loop------------");
	        while(n-->0){
	            System.out.println(n);
	        }
	        System.out.println("doWhile loop------------------");
	        do{
	            System.out.println("Enter another number:");
	             num=sc.nextInt();

	        }while(num>1 && num<=10);
	        System.out.println("Another number entered is :"+num);
	        sc.close();

	}

}
