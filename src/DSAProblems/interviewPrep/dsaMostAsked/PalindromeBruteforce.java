package DSAProblems.interviewPrep.dsaMostAsked;

public class PalindromeBruteforce {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome? " + isPalindromeCheck(input)); // true
    }

    private static boolean isPalindromeCheck(String input) {
        String cleanedString = "";
        for (int i = 0; i < input.length();i++){
            char currentChar = input.charAt(i);
            if(Character.isLetterOrDigit(currentChar)){
               cleanedString += Character.toLowerCase(currentChar);
            }
        }
        // reverse a String
        String reversedString = "";
        for (int i = cleanedString.length() - 1; i >= 0; i --){
            reversedString += cleanedString.charAt(i);
        }
        return reversedString.equals(cleanedString);
    }
}
