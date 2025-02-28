package DSAProblems.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementNBy2 {
    public static void main(String args[]) {
        int[] array =  {4,4,2,4,3,4,4,3,2,4};
        int ans = majorityElement(array);
        System.out.println("The majority element is: " + ans);

    }



    public static int majorityElement(int array[]) {
        //size of the given array:
        int n =array.length;
        //declaring a map:
        HashMap<Integer, Integer> map = new HashMap<>();
        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (n / 2)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
