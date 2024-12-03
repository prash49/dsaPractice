package DSAProblems.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
Input: n = 3
Output: ["1","2","Fizz"]

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]

* */
public class FizZBuzzProblem {


    public static void main(String[] args) {
        int input = 5;
        System.out.println(findFizBuzz(input));
    }

    static List<String> findFizBuzz(int input) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // i is divisible by 3 and 5 both
                result.add("FIZZBUZZ");
            } else if (i % 3 == 0) {
                result.add("FIZZ");
            } else if (i % 5 == 0) {
                result.add("BUZZ");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
