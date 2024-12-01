package searching;

public class BinarySearch {
    // binary search :it fetch index from sorted array as name says it'll devide the Array into two in each iteration by comparing value with mid

    public static void main(String[] args) {
        int[] arr  = {-16,-9, 0, 1,2,6,90,654};
        int target = -1;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end -start)/2;

            if(target == arr[mid]){
                return  mid;
            } else if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }


        return -1;

    }
}
