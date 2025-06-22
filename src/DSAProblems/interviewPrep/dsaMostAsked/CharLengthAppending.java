package DSAProblems.interviewPrep.dsaMostAsked;

public class CharLengthAppending {
    public static void main(String[] args) {
        System.out.println(stringLengthEncode("aabbbcc"));   // a2b3c2
        System.out.println(stringLengthEncodeVariation("aaabcccdd"));   // a2b3c2
        System.out.println(stringLengthEncode("abcd"));      // a1b1c1d1
        System.out.println(stringLengthEncode("aa"));
    }

    private static String stringLengthEncode(String input) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (currentChar == input.charAt(i)) {
                count++;
            } else {
                builder.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        builder.append(currentChar).append(count);
        return builder.toString();
    }

    private static String stringLengthEncodeVariation(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (currentChar == input.charAt(i)) {
                count++;

            }else{
                if (count > 1) {
                    stringBuilder.append(currentChar).append(count);
                }else stringBuilder.append(currentChar);
                currentChar = input.charAt(i);
                count =1;
            }
        }
        if (count > 1){
            stringBuilder.append(currentChar).append(count);
        }else stringBuilder.append(currentChar);

        return stringBuilder.toString();
    }
}
