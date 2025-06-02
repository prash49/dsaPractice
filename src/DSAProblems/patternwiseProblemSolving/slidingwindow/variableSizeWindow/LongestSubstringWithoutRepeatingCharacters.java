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
        //edge case handling
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length() - 1; right++) {
            char currentChar = s.charAt(right);
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
                // If the character is a repeat within the current window,
                // move the left pointer to just after the last occurrence.
                // Use Math.max to ensure left doesn't move backward.
                left = charMap.get(currentChar) + 1;
            }
            charMap.put(currentChar, right);
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
