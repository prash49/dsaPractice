package DSAProblems.stack;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "({[]})";
        String s2 = "(]"; //false
        System.out.println(isValidParantheses(s));
    }

    private static boolean isValidParantheses(String s) {
        // approach: if its a opening bracket push intto stack
        // if its closing brakcet check if the top of the stack matches its opening pair
        // if not return false
        // if its true pop it.
        // in the end if the bracket is empty return true else false.

        
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if (stack.isEmpty()) return true;
                char top = stack.pop();
                if (( ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[') ) {
                    return false;

                }
             }
        }
        return stack.isEmpty();
    }
}
