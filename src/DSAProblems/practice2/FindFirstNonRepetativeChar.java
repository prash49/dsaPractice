package DSAProblems.practice2;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepetativeChar {
    public static void main(String[] args) {
        String str = "swiss";
       char nonRepeatativeChar = findFirstNonRepeatingChar(str);
        System.out.println(nonRepeatativeChar);
    }

    private static char findFirstNonRepeatingChar(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for (char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '-';
    }
}
