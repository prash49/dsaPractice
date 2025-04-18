package DSAProblems.interviewPrep.mostAsked;

public class AValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("is it a Palindrome:"+ isItPalindrome(str));

    }

    private static boolean isItPalindrome(String str) {
        // we are using two pointers to check
        //hence initialize
        int i = 0, j = str.length() -1;
        while (i < j){
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
        }

        return true;
    }
}
