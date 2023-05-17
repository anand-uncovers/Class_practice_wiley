package dp_practice_12_05_23;

public class DP3Problem_prime_12_05_23 {
	public static boolean PrimeorNot(int n)
    {
        if (n <= 1)
            return false;
 
        if (n == 2 || n == 3)
            return true;
 
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
 
        return true;
    }

    public static void main(String[] args)
    {
        if (PrimeorNot(11)) {
            System.out.println("The given numberis prime number.");
        }
        else {
            System.out.println("The given number is not a prime number");
        }
    }
}
