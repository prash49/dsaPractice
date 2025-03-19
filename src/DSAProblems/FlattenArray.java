package DSAProblems;

import java.util.ArrayList;
import java.util.List;  

public class FlattenArray {  
    
    public static void main(String[] args) {  
        Object[] multiDimArray = {  
            1,   
            new Object[]{2, 3, new Object[]{4, 5}},  
            new Object[]{new Object[]{6, 7}, 8},  
            9  
        };  

        Integer[] flattenedArray = flattenToIntegerArray(multiDimArray);  
        
        // Print the result  
        for (Integer num : flattenedArray) {  
            System.out.print(num + " ");  
        }  
    }  

    public static Integer[] flattenToIntegerArray(Object[] array) {  
        List<Integer> result = new ArrayList<>();  
        flatten(array, result);  
        return result.toArray(new Integer[0]);  
    }  

    private static void flatten(Object[] array, List<Integer> result) {  
        for (Object element : array) {  
            if (element instanceof Integer) {  
                result.add((Integer) element);  
            } else if (element instanceof Object[]) {  
                flatten((Object[]) element, result); // Recursively flatten nested arrays  
            }  
        }  
    }  
}  