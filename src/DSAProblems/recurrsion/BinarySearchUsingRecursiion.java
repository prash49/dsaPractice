package DSAProblems.recurrsion;

public class BinarySearchUsingRecursiion {
    // recurence relation is first compare o (1) if true return if not divide the array
    public static void main(String[] args) {
        int[] nums = {12,14,18,19,25,60,90,101};
        int start = 0, end = nums.length -1 ;
        int target = 60;
        int index = binaryRecursive(nums,start, target,end);
        System.out.println("data found at index:"+ index);
    }

    private static int binaryRecursive(int[] nums, int start, int target, int end) {
        // edge if my start > end then we didn't found the target in nums array return -1
        if(start > end){
            return  -1;
        }
        // find the mid in the array for comparission. ex: array of length 10
        // start = 0 and end = 10  ==  0 + (10 - 0) / 2 = 0 + (10) /2 = 0 + 5 = 5 mid = 5
         int mid  = start + ( end - start) /2 ;
        if (nums[mid] == target){
            return mid;
        }
        if (target > nums[mid]){
            return  binaryRecursive(nums, mid + 1, target, end);
        }
        return binaryRecursive(nums, start, target,mid - 1);
    }
}
