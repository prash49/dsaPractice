package DSAProblems.Strings;

/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]*/
public class ReverseString {
    public static void main(String[] args) {
        String name = "Prashanth";
        System.out.println(reverseStringUsingTwoPointer(name.toCharArray()));
    }

    static char[] reverseStringUsingTwoPointer(char[] s) {
        int startPoint = 0;
        int endPoint = s.length - 1;
        while (startPoint < endPoint) {
            swap(s, startPoint, endPoint);
            startPoint++;
            endPoint--;
        }
        return s;
    }

    static void swap(char[] charArray, int first, int second) {
        char temp = charArray[first];
        charArray[first] = charArray[second];
        charArray[second] = temp;
    }
}

