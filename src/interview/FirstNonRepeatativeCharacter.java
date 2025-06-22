package interview;

public class FirstNonRepeatativeCharacter {
    public static void main(String[] args) {
        String str = "Swiss";
        char ch = findFirstNonRepetativeCharacter(str);
        if (ch  == '-'){

        }
    }

    private static char findFirstNonRepetativeCharacter(String str) {
        int[] freq = new int[256];
        for (int i= 0; i< str.length(); i++){
            freq[str.charAt(i)]++;
        }
        for (int i = 0 ; i < str.length(); i++){
            if(freq[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }
        return  '-';
    }
}
