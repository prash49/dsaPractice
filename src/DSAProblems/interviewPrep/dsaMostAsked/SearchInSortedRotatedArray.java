package DSAProblems.interviewPrep.dsaMostAsked;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;
        System.out.println(searchInRotatedSortArray(arr, target));
    }

    private static int searchInRotatedSortArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // loop through the array using Two pointer approach
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            //to check if my left side of the array is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; // to search in the left half
                } else {
                    left = mid + 1;
                }
            } else {
                //to check num in right side
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }

        }
        return -1;

    }
}
