package DSAProblems.recurrsion;

public class SumOfDigits {
    public static void main(String[] args) {
          int num = 123;
       int sum =   findSumWithoutRec(num);
        System.out.println("sum without recursion: "+ sum);
       // using recursion
        int sumnum = 0;
        sumnum = SumUsingRec(num);
        System.out.println("sum using recursion:"+ sumnum);
    }

    private static int SumUsingRec(int num) {
        if(num == 0){
            return  0;
        }
        return  num % 10 + SumUsingRec( num / 10 );
    }

    private static int findSumWithoutRec(int num) {
        int sum = 0;
        while (num != 0){
            sum = sum + num % 10;
            num = num /10;
        }
        return sum;
    }
}
