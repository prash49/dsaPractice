package DSAProblems.Strings;

/*You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.



Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.*/
public class LongestRepeatatingCharReplacement {
    public static void main(String[] args) {
        String str = "AABABCCCBCC";
        System.out.println("frequency:" + frequencyAfterCharReplacement(str, 2));
    }

    private static int frequencyAfterCharReplacement(String str, int i) {
        int[] freq = new int[26];// define a array to store the frequency of each character;
        int left = 0;
        int maxFreq = 0;
        int maxwindow = 0;
        // now Start a loop till the end of the Array
        for (int right = 0;right <  str.length();right++){
            freq[str.charAt(right)- 'A']++;
            // update max frequency of a char in the array
            maxFreq = Math.max(maxFreq,freq[str.charAt(right) - 'A' ]);
            int windowLength = right - left+1;

            if(windowLength - maxFreq > i){
                freq[str.charAt(left) - 'A']--;
                left++;
            }
            windowLength = right - left + 1;
            maxwindow = Math.max(maxwindow,windowLength);
        }

        return maxwindow;
    }

}
