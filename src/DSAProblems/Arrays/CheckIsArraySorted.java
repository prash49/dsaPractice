package DSAProblems.Arrays;

public class CheckIsArraySorted {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,6};
        System.out.println("is array sorted::"+isArraySorted(array));
    }

    private static boolean isArraySorted(int[] array) {
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i -1]){
                return false;
            }
        }
        return true;
    }
}
