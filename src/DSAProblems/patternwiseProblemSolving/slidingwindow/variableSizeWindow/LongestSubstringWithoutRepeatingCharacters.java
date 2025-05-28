package DSAProblems.patternwiseProblemSolving.slidingwindow.variableSizeWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    /*TODO Given a string s, find the length of the longest substring without repeating characters.*/
    public static void main(String[] args) {
        String s = "aabcda";
        findLongestSubstringWindowSizeWithoutRepeatingChars(s);
    }

    private static int findLongestSubstringWindowSizeWithoutRepeatingChars(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length() - 1; right++) {
            char currentChar = s.charAt(right);
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
                left = charMap.get(currentChar) + 1;
            }
            charMap.put(currentChar,right);
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
