package DSAProblems.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {
        int[] array = {2, 57, 41, 78, 100, 22, 47, 1};
        findSecondLargestAndSmallest(array);
        findSecondLargestAndSmallestByOptimalSolution(array);
    }

    private static void findSecondLargestAndSmallestByOptimalSolution(int[] array) {
       //TOdo note to find a max value always assign to min value as initial value ex: max = Integer.minValue
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        // first for loop to find the Smallest and Largest
        int i;
        for(i =0; i < array.length; i ++){
            // compare each value with smal and large to smallest and largest
            small = Math.min(small, array[i]);
            large = Math.max(large, array[i]);
        }
        // from above i got smallest and largest element now i need to get Second smallest
        for (i= 0; i< array.length; i++){
            if( array[i] < secondSmall &&  array[i] != small){
                secondSmall = array[i];
            }
            if(  array[i] > secondLarge &&  array[i] !=  large){
                secondLarge = array[i];
            }
        }
        System.out.println("second smallest ::"+secondSmall);
        System.out.println("second largest ::"+secondLarge);
    }
    //time complexitiy we do 2 liner traversals 2 * o(n) where 2 is constant and negligible

    //brute force
    private static void findSecondLargestAndSmallest(int[] array) {
          if(array.length ==0 && array.length ==1){
              System.out.println("array size is less");
          }
        Arrays.sort(array);
        System.out.println("second smallest :: {}"+ array[1]);
        System.out.println("Second largest"+ array[array.length - 2]);
        // to sort in reverse order
    }
    //Time complexityu we are sorting hence o(n logn)





}
