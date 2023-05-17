package dp_practice_12_05_23;

public class DP2Problem_Fibonacci {
	static int fib(int n)
    {
   
    int dp[] = new int[n+2]; 
    int i;
   
    dp[0] = 0;
    dp[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
        dp[i] = dp[i-1] + dp[i-2];
    }
      
    return dp[n];
    }
      
    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}
