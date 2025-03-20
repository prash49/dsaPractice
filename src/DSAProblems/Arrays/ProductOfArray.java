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

    private static int[] productArrayExceptSelf(int[] nums) {
        int count = 0; // to count the zeros
        int product = 1;
        int[] productArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                product *= nums[i];
            }
        }
        System.out.println("product:" + product);
        for (int j = 0; j < nums.length; j++) {
            // handle when count of zero is one except that place everthing will be zero
            if (count == 1 && nums[j] != 0) {
                productArray[j] = 0;
                // next we know the at zero th value place all product will there only when count ==0
            } else if (count == 1 && nums[j] == 0) {
                productArray[j] = product;
                // if i case zero count is more than 1 then all values in array will be zero
            } else if (count >= 2) {
                productArray[j] = 0;
            } else {
                // if no zero present then product divide the current value will be ur product except the self
                System.out.println("product :" + product + " i " + j + " nums[i]" + nums[j]);
                productArray[j] = product / nums[j];
            }
        }
        return productArray;
    }

}
