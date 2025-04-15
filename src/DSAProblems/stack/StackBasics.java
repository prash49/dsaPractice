package DSAProblems.stack;

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        /*
        * TODO stack is Last in first out ds
        *  it have operations like push,pop,peek , isEmpty()
        * push to add item , pop to remove,peek view top item without removing
        * isEmpty check if stack is empty
        *
        * */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
