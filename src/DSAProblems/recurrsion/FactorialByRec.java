package DSAProblems.recurrsion;

public class FactorialByRec {
    public static void main(String[] args) {
        int number = 5;
        int val = factorial(number);
        System.out.println("factorial of 5 is:"+ val);
    }

    private static int factorial(int number) {
        if (number <= 1){
            return 1;
        }
        return number * factorial(number - 1 );
    }
}
