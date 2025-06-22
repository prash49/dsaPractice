package interview;

public class FindAllDuplicatesWithoutcollections {
    /*
    Input:  {4, 2, 7, 2, 4, 9, 3}
Output: 2 4
    * */
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 2, 4, 9, 3};
        findAllDuplicatesFromList(array);
    }

    private static void findAllDuplicatesFromList(int[] array) {
        // lets say all the values will be in range 0-99
        int n = 100;
        boolean[] seen = new boolean[n];
        boolean[] printed = new boolean[n];
        System.out.println("duplicates");
        for (int i = 0; i < array.length; i++){
            int val = array[i];
            if (seen[val] && !printed[val]){
                System.out.print(val+" ");
                printed[val] =true;
            }else {
                seen[val] = true;
            }
        }
    }
}
