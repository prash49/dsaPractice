package DSAProblems.dynamicProgramming;

import java.util.Arrays;

public class FibonacciDP {
    public static void main(String[] args) {
        // Fibonacci using DP
        //find the fibonacci of 5
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("fibonacci"+
                fibo(n,dp));
    }

    private static int fibo(int n, int[] dp) {
        if(n<=1) return n;

        if(dp[n]!= -1) return dp[n];
        return dp[n]= fibo(n-1,dp) + fibo(n-2,dp);
    }
}
