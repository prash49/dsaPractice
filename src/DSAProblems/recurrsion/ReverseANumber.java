package DSAProblems.recurrsion;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("revNumber" + reverseANumber(12345));
        revNumRec(12345);
        System.out.println("rev  number using rec" + sum);
    }

    private static int reverseANumber(int num) {
        int rev = 0;
        while (num != 0){
            int remainder =  num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;

        }
        return rev;
    }

   static int sum = 0;
    private static void revNumRec(int num){
        if (num == 0){
            return ;
        }
        int remainder = num % 10;
        System.out.println("remainder :"+ remainder);
        sum = sum * 10 + remainder;
        revNumRec(num /10);
    }
}
