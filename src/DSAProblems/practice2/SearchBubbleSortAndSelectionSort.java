package DSAProblems.practice2;

public class SearchBubbleSortAndSelectionSort {
    public static void main(String[] args) {
        //practicing binarysearch, bubble sort and Selection sort
        int[] nums = {3,5,6,7,9};
        binarySearchInAray(nums,10 );
    }

    private static int binarySearchInAray(int[] nums, int i) {
        int lastIndex = nums.length;
        int startIndex = 0;
        while (startIndex < lastIndex){
            int mid = startIndex + (lastIndex - startIndex) /2;
            if (nums[mid] == i){
                return mid;
            }else if (nums[mid] > i ){
                startIndex = mid +1;
            }else {
                lastIndex = mid - 1;
            }
        }
        return -1;
    }

    private  static  void bubbleSort(int[] nums){
        for (int i =0; i < nums.length ; i++){
            for (int j = 1; j < nums.length; j++){
                if (nums[j] < nums[j -1]){
                    swap(nums, j, j-1);
                }
            }
        }
    }

    private static void swap(int[] nums,int statrt,int end){
        int temp = nums[statrt];
        nums[statrt] = nums[end];
        nums[end] = temp;
    }
    private static void selectionSort(int[] nums){
        // i need to select max index and place the value there
        for (int i = 0; i < nums.length ; i++){
            int lastIndex = nums.length -i -1;
            int maxIndex = findMaxIndex(nums, 0, lastIndex);
            swap(nums,i, maxIndex);
        }

    }

    private static int findMaxIndex(int[] nums, int start, int lastIndex) {
        int max = start;
        for (int i = start; i < lastIndex; i++){
            if (nums[max] < nums[i]){
                max =i;
            }
        }
        return max;
    }


    private  static  void insertionSort(int[] nums){
        for (int i = 0; i < nums.length -1; i++){
            for (int j = i + 1; j > 0; j --){
                if(nums[j] < nums[j -1 ]){
                    swap(nums, j, j -1);
                }else {
                    break;
                }
            }
        }
    }
}
