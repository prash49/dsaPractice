package DSAProblems.dynamicProgramming;

public class ClaimbingStairs {
    /*Todo You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

    public static void main(String[] args) {

        int numStairs = 6;
        int count = numWays(numStairs);
        System.out.println("number of way to claim stairs:" + count);

    }

    private static int numWays(int numStairs) {
        if (numStairs == 0 || numStairs == 1) {
            return 1;
        }
        return  numWays(numStairs -1) + numWays(numStairs -2);
    }
}
