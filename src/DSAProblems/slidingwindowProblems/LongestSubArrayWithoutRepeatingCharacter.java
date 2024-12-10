package DSAProblems.slidingwindowProblems;

import java.util.HashMap;
import java.util.Map;

/*Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.*/
public class LongestSubArrayWithoutRepeatingCharacter {

    //as its about subArray we can use sliding window as they provided the length of the window k is 3

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("maxsubArray size :" + findLongestSubArray(str, 3));
    }


    static int findLongestSubArray(String s, int k) {
        // Approach we need to loop through the array of char and we need to check the each char and is it matching withs its subsequent
        // next char if yes increase the Max value subArray
        // store char and its occurances in a map
        int maxSubLen = 0;
        int stringLen = s.length();
        int i = 0;
        int j = 0;
        Map<Character, Integer> characterIndexMap = new HashMap<>();

        while (j < stringLen) {

            char currentChar = s.charAt(j);
            if (characterIndexMap.containsKey(currentChar) && characterIndexMap.get(currentChar) >= i) {
                i = characterIndexMap.get(currentChar) + 1;
            }
            characterIndexMap.put(currentChar, j);
            maxSubLen = Math.max(maxSubLen, j - i + 1);
            j++;

        }
        return maxSubLen;
    }
}
