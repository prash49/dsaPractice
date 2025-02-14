package DSAProblems.recurrsion;

public class FactorialByRec {
    public static void main(String[] args) {
        int number = 5;
        int val = factorial(number);
        System.out.println("factorial of 5 is:"+ val);
        // sum of N
        int sum = sum(number);
        System.out.println("sum of n to 5 is:"+ sum);
    }

    private static int factorial(int number) {
        if (number <= 1){
            return 1;
        }
        return number * factorial(number - 1 );
    }
    private static int sum(int number) {
        if (number <= 1){
            return 1;
        }
        return number + sum(number - 1 );
    }
}
