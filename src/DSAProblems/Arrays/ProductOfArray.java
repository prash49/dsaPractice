package DSAProblems.Arrays;

import java.util.Arrays;

// Product of an array except itself
public class ProductOfArray  {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productOfArrayEasy(arr)));
        System.out.println(Arrays.toString(productOfArrayExceptItself(arr)));
    }
    static int[] productOfArrayEasy(int[] nums){
        int[] newArray = new int[nums.length];
        int product = 1;
        for (int j = 0; j < nums.length; j ++){
            product = product * nums[j];
        }
        for (int i = 0; i < nums.length; i++){
            newArray[i] = (product / nums[i]);
        }
        return newArray;
    }

    // brute force loop through and add each values into array
    // better approach:  using prefix and postfix

    public static int[] productOfArrayExceptItself(int[] nums){
        int[] resultArray = new int[nums.length];
        Arrays.fill(resultArray,1);
        int prefix= 1;
        int postfix =1;
        // loop left to right and set all the variable with prefix mul
        for(int i = 0; i  < nums.length; i ++){
            System.out.println("index: "+ i);
            System.out.println("prefix before : "+prefix);
            resultArray[i] = prefix;
            prefix = nums[i] * prefix ;
            System.out.println("after prefix:"+ prefix);
        }
        // loop right to left and
        for(int j = nums.length - 1; j >= 0; j--){
            resultArray[j] = resultArray[j] * postfix;
            postfix = postfix* nums[j];
        }
        return resultArray;



    }

}
