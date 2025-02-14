package DSAProblems.recurrsion;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        // recursion break down bigger problem into smaller problem and see by calling a method will solve
        // the problem? if yes then handle base condition to break the loop
        // and implement recursive program
        // find recursive relation  by formula ex: Fibo(n) = Fibo(n-1) + fibo(n -2 )
        // find the fibonacci of 6;
        int fibVal = fibonacci(5);
        System.out.println("Fibonacci of "+ 6 +" is:"+ fibVal);
    }
    static int fibonacci(int n){
        // handle base conditions;
        if(n <  2){
            return n;
        }
        // now call method recursivly
        return fibonacci(n - 2) + fibonacci( n - 1 );
    }
}
