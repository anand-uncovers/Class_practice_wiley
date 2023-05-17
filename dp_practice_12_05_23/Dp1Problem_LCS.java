package dp_practice_12_05_23;

public class Dp1Problem_LCS {

    public static int findLCS(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1+1][len2+1];
        
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        String s1 = "AASTHA";
        String s2 = "ASTHA";
        int lcs = findLCS(s1, s2);
        System.out.println("Length of LCS is " + lcs);
    }
}