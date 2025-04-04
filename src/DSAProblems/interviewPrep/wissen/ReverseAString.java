package DSAProblems.interviewPrep.wissen;

public class ReverseAString {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println("reverse:"+ reverseAString(string));
    }

    private static String reverseAString(String string) {
        char[] chars = string.toCharArray();
        System.out.println("chars length : "+ chars.length);
        int start = 0;
        int end = chars.length - 1 ;
        while (start < end){
            swap(chars, start,end);
            start++;
            end--;
        }
        return new String(chars);
    }
   public static void swap(char[] chars, int start, int end){
        char ch = chars[start];
        chars[start] = chars[end];
        chars[end] = ch;
    }
}
