package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithoutRepeatingChars {
    public static void main(String[] args) {

        String str = "abcabcbb";
        System.out.println("maxsubArray size :" + findLongestSubString(str));
    }


    static int findLongestSubString(String s) {
        // Approach we need to loop through the array of char and we need to check the each char and is it matching withs its subsequent
        // next char if yes increase the Max value subArray
        // store char and its occurances in a map
        int maxSubLen = 0;
        int stringLen = s.length();
        int left = 0;
        int right = 0;
        Map<Character, Integer> characterIndexMap = new HashMap<>();
// i need loop till the end where my right will be incrementing till the end
        while (right < stringLen) {
//
            char currentChar = s.charAt(right);
            System.out.println("currentChar :" + currentChar);
            if (characterIndexMap.containsKey(currentChar) && characterIndexMap.get(currentChar) >= left) {
                left = characterIndexMap.get(currentChar) + 1;
            }
            characterIndexMap.put(currentChar, right);
            maxSubLen = Math.max(maxSubLen, right - left + 1);
            right++;
        }
        return maxSubLen;
    }

}
