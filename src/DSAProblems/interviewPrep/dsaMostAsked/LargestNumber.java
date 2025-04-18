package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        // example [2,10] can be formed as 210 or 102 need to return 210
        int[] list = {10,2,4,6,8,9};
        System.out.println( findTheLargestNumberAfterCombine(list));
    }

    private static String findTheLargestNumberAfterCombine(int[] list) {
        // convert numbers to String
        String[] array = new String[list.length];
        for (int i = 0; i <  list.length; i++){
            array[i] = String.valueOf(list[i]);
        }
        // define a comparator
        Comparator<String> compare = (str1,str2) -> (str2+str1).compareTo(str1+str2);
        //sort the String using custom comparision function


        Arrays.sort(array,compare);

        // handle leading zeros
        if (array[0].equals("0")){
            return "0";
        }
        //concatinate the sorted string
        StringBuilder sb = new StringBuilder();
        for (String str : array){
            sb.append(str);
        }
        return sb.toString();
    }
}
