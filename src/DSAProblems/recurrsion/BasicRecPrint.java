package DSAProblems.recurrsion;

public class BasicRecPrint {
    // in this we will get deep dive into recursion basics
    // ex print 54321 when n = 5
    // very basic
    public static void main(String[] args) {
        int  n = 5;
        printNum(n);
        // now print 12345 if we give 5
        printNumRev(n);
    }

    private static void printNum(int n) {
        // edge case when to break the recursion
        if(n  == 0){
            return;
        }
        System.out.println("num:"+ n);
        printNum(n -1 );
        // in this method first i'll print the number then i'll reduce while calling back 5 prints then 4....
    }

    private static void printNumRev(int n){
        // so its tricky here instead of printing while recursion
        //print after recursive call
        if(n == 0){
            return;
        }
        printNumRev(n - 1);
        System.out.println("number is:"+ n);
    }
}
