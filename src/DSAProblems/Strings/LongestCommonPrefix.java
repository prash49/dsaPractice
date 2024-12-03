package DSAProblems.Strings;

/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"*/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        // Consider prefix string is from 0th index
        System.out.println("longest common prefix is:" + findLongestCommonPrefix(strs));
    }

    static String findLongestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String prefix = strs[0];
        // compare prefix with each elements in string array
        for (int i = 1; i < strs.length; i++) {
            System.out.println("index of does:" + strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }

        }

        return prefix;
    }
}
