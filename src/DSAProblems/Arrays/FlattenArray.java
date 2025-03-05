package DSAProblems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) {
        Object[] arr = {
                1, 2, 3,
                new Object[]{4, 5, new Object[]{6, 7}},
                8,
                new Object[]{9}
        };

        List<Object> flattenedList = flatten(arr);

    }

    private static List<Object> flatten(Object[] arr) {
        List<Object> result = new ArrayList<>();
        for (Object element : arr){
            //check if in for is it a object array if yes then do recurssion and
            if (element instanceof  Object[]){
               result.addAll( flatten((Object[]) element));
            }else {
                result.add(element);
            }
        }
        return result;
    }
}
