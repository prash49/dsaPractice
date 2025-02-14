package DSAProblems.recurrsion;

import java.util.Scanner;

public class PrintUsingRecursion {
    public static void main(String[] args) {
        //write a method which take input and prints all the numbers before it
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int intializeVal = 1;
//        printNumber(number,intializeVal);
        printNumberInVideo(1, 5);

    }
    static void  printNumber(int n, int intialValue){
        System.out.println("num:"+ intialValue);
        intialValue ++;
        if( n >= intialValue){
            printNumber(n,intialValue);
        }
    }
    static void printNumberInVideo(int initialVal, int num){
        System.out.println("number :" + initialVal);
        if (initialVal == num){
            System.out.println(num);
            return;
        }
        printNumberInVideo(initialVal + 1, num);
    }
}
