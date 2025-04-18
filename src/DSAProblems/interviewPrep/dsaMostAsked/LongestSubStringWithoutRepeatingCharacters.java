package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String string = "abcabcbb";
        int maxLength = findLongestSubstring(string);
        usingSet(string);

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

  static   void usingSet(String str) {
        Set<Character> unquieSet = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        int right = 0;
        while (right < str.length()) {
            if (!unquieSet.contains(str.charAt(right))) {
                unquieSet.add(str.charAt(right));
                right++;
            } else {
                //remove that from the set
                unquieSet.remove(str.charAt(left));
                left++;
            }
            maxLen = Math.max(maxLen, unquieSet.size());
        }
        System.out.println("max length: " + maxLen);
    }
}
