package stringProblems;

public class PrintAndCountAllSubSequence {
    public static void main(String[] args) {
        String str = "abc";

        printSubSequence(str, "");
    }

    private static void printSubSequence(String input, String unprocessed) {

        if (input.isEmpty()){
            System.out.println(unprocessed);
            return;
        }
        printSubSequence(input.substring(1), input.charAt(0)+unprocessed);
        printSubSequence(input.substring(1), unprocessed);
    }
}
