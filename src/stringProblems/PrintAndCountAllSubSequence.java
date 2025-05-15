package stringProblems;

import java.util.ArrayList;
import java.util.List;

public class PrintAndCountAllSubSequence {
    public static void main(String[] args) {
        String str = "abc";

        printSubSequence(str, "");
    List<String> list =     countSubSequence(str, "");
        System.out.println("size:"+ list.size());
    }

    private static void printSubSequence(String input, String unprocessed) {

        if (input.isEmpty()){
            System.out.println(unprocessed);
            return;
        }
        printSubSequence(input.substring(1), unprocessed+input.charAt(0));
        printSubSequence(input.substring(1), unprocessed);
    }

    private static List<String> countSubSequence(String input, String unprocessed) {

        if (input.isEmpty()){
            ArrayList<String> output = new ArrayList<>();
            output.add(unprocessed);
            System.out.println(unprocessed);
            return output;
        }
        List<String> left =  countSubSequence(input.substring(1), unprocessed+input.charAt(0));
        List<String> right = countSubSequence(input.substring(1), unprocessed);
        left.addAll(right);
        return left;

    }
}
