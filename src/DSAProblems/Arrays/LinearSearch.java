package DSAProblems.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {34,6,7,8,90,12,56};
        int targetValue = 90;
        int position = linearSearch(array, targetValue);
        System.out.println("position:"+ position);
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i ++){
            if(value == array[i]){
                return i;
            }
        }
        return  -1;
    }
}
