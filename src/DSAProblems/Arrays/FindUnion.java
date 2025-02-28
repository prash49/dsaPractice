package DSAProblems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindUnion {
    // union means combining two arrray with distincts ex: array1 12345 and array2 2456 union is 123456
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7};
        ArrayList<Integer> union = findUnion(array, array2);
        for (int value : union){
            System.out.print( value+" ");
        }
    }

    private static ArrayList<Integer> findUnion(int[] array, int[] array2) {
        ArrayList<Integer> union = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            set.add(array2[i]);
        }
        for (int intValue : set) {
            union.add(intValue);
        }
        return union;

    }
}
