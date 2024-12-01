package searching;

public class AgnosticBinarySearching {

    // there will be scenario where the sorted array can be ascending or descending that we don't know
    // first fin the array sorted order by comparing first and last element


    public static void main(String[] args) {
        int[] arr = {-12, -2, 10, 11, 12, 54};
        int[] arr2 = {54, 12,11,10,5,4,1,-10,-21};
        int target = 11;
        int index = agonsticArraySearching(arr, target);
        System.out.println(index);
        int index2 = agonsticArraySearching(arr2, target);
        System.out.println(index2);
    }

    static int agonsticArraySearching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            boolean isAsc = arr[start] < arr[end];
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return -1;
    }

}

