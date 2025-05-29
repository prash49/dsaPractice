package DSAProblems.patternwiseProblemSolving.twoPointers.sameDirection;

public class ValidPalindromeByDeletingMax1 {
    public static void main(String[] args) {
        /*TODO : Given a string s, return true if the s can be a palindrome after deleting at most one character.*/
        String s = "abca";
        boolean isPalindrome = isValidPalindrome(s);
        System.out.println(isPalindrome);
    }

    private static boolean isValidPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else if (s.charAt(left) != s.charAt(right)) {
                boolean isPalin = (!isPalindromRange(s, left + 1, right) || !isPalindromRange(s, left, right - 1));
                return isPalin;
            }
        }
        return true;
    }

    private static boolean isPalindromRange(String s, int left, int right) {
        System.out.println("isPalindrome");
        int start = left, end = right;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
            System.out.println(start);
            System.out.println(end);
        }
        return true;
    }
}
