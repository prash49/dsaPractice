package DSAProblems.practice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        int[] productArray = productArrayExceptSelf(nums);
        System.out.println(Arrays.toString(productArray));
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
