package DSAProblems.practice2;

public class StringPalindrome {
    public static void main(String[] args) {
        String str  = "A man, a plan, a canal: Panama";
        boolean isPalindrome = checkIfGivenStringIsPalindrome(str);
        System.out.println(isPalindrome);

    }

    private static boolean checkIfGivenStringIsPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
          while (left < right &&  !Character.isLetterOrDigit(str.charAt(left))) { left++;};
          while (left < right && !Character.isLetterOrDigit(str.charAt(right))) { right--;};
          if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
              return false;
          }
        }
        return true;
    }
}
