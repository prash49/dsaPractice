package DSAProblems.interviewPrep.dsaMostAsked;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        findSubarray(arr, target);
    }

    private static void findSubarray(int[] arr, int target) {
        int start = 0;
        int sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum > target && start < end) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                System.out.println("sub array sequence :" + start + " to " + end);
                return;
            }
        }
        System.out.println("no subArray found");
    }
}
