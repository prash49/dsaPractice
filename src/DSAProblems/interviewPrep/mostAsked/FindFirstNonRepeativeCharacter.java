package DSAProblems.interviewPrep.mostAsked;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeativeCharacter {
    public static void main(String[] args) {
        String string = "swiss";
        char c = findNonRepeatingCharacter(string);
        System.out.println("non repeating character :"+ c);
    }

    private static char findNonRepeatingCharacter(String string) {
        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for (char ch : string.toCharArray()){
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0)+ 1);
        }
        for (Map.Entry<Character,Integer> entry : characterIntegerMap.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '_';
    }
}
