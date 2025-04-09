package DSAProblems.interviewPrep.wissen;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String string = "abcabcbb";
        int maxLength = findLongestSubstring(string);
    }

    private static int findLongestSubstring(String string) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < string.length(); right++) {
            Character currentChar = string.charAt(right);
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }
            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
}
