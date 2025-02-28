package DSAProblems.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,2,3,3,3};
      int k=   removeDuplicatesFromArray(array);
      // here the returned array has sorted till k
        for (int i = 0; i < k; i++){
            System.out.print(array[i]+" ");
        }
    }

    private static int removeDuplicatesFromArray(int[] array) {
        int i =0;
        for(int j = 1; j < array.length; j++){
            if(array[i] != array[j]){
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }

}
