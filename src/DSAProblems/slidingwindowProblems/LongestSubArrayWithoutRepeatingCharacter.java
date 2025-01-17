package DSAProblems.slidingwindowProblems;

import java.util.HashMap;
import java.util.LinkedList;
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
        System.out.println("maxsubArray size :" + findLongestSubString(str, 3));
        System.out.println("practice:" + practiceSubString(str));
    }


    static int findLongestSubString(String s, int k) {
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

    public static int practiceSubString(String string) {
        int leftPointer = 0;
        int rightPointer = 0;
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        // sol: i need to loop through the string and check each char in a map and its index
        while (rightPointer < string.length()) {
            char currentChar = string.charAt(rightPointer);
            // now i need to check the Map whether the char present if present what  is its Index which greater than leftPointer pointing to it
            // ex: abcda if my rightPointer comes at a it'll check whether the a present as i can see a is present at 0 index already then i'll check if my leftPointer already poiting ther

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= leftPointer) {
                // if its true i need to move my pointer to left + 1 so here i just assign left = map.getValue() + 1
                leftPointer = charIndexMap.get(currentChar) + 1;
                // so from above line i'll be updating the left pointer to point
            }
            // after assigning left i need to update the that value into my map
            charIndexMap.put(currentChar, rightPointer); // it'll overide the value
            //where above line updates the index value of character
            // after that check the max
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);

            rightPointer ++;
            System.out.println("maxLength:" + maxLength);
        }
        return maxLength;

    }
}
