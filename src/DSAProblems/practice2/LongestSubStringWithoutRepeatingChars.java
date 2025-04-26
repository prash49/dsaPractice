package DSAProblems.practice2;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args) {
        System.out.println("Longest Substring Length: " + lengthOfLongestSubstring("abcabcbb")); // Output: 3

    }

    private static int  lengthOfLongestSubstring(String string) {
        Set<Character> set = new HashSet<>();
        int left = 0,right = 0,maxLen = 0;
        while (left < string.length()){
            if (!set.contains(string.charAt(right))){
                set.add(string.charAt(right));
                maxLen = Math.max(maxLen, right - left);
            }else {
                set.remove(string.charAt(left++));
            }
        }
        return maxLen;
    }
}
