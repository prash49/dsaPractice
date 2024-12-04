package DSAProblems.Strings;

/*Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true*/
public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println("isValidAnagaram :"+ isValidAnagram(str1,str2));
    }
    static boolean isValidAnagram(String s, String t){
        if(s.length() != t.length()){
            return  false;
        }
        int[] counter = new int[26];
        for (int i = 0 ; i < s.length(); i ++){
            System.out.println(s.charAt(i) - 'a');
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i< s.length(); i ++){
            if(counter[i] != 0){
                return false;
            }
        }
        return true;
    }
}
