package DSAProblems.stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    //Min Stack	Custom stack, supporting getMin() in O(1)
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        /*Push it to mainStack as usual.
In minStack, only push it if it's smaller than or equal to the current minimum.
*/
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        /*When you pop:

Pop from mainStack.

If the popped value is equal to the top of minStack, pop from minStack too.*/
        int popped = mainStack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }

    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
