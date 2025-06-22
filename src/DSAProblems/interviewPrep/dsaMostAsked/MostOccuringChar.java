package DSAProblems.interviewPrep.dsaMostAsked;

public class MostOccuringChar {
    public static void main(String[] args) {
        String input = "aaaaaabbcccddddeee";
        char maxChar = getMaxOccurringChar(input);
        System.out.println("Max occurring character: " + maxChar);
    }

    private static char getMaxOccurringChar(String input) {
        int[] chars = new int[256]; // to keep count of each character
        for (int i = 0; i < input.length();i++){
            chars[input.charAt(i)]++;
        }
        int max = -1;
        char result = '-';
        for (int i = 0; i< input.length(); i++){
            if(chars[input.charAt(i)] > max){
                max = chars[input.charAt(i)];
                result = input.charAt(i);
            }
        }
        return result;
    }
}
