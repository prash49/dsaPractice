package DSAProblems.dynamicProgramming;

public class CountAllSubSetsWithSumK {
    public static void main(String[] args) {
        int k = 3;
        int[] array = {1, 2, 2, 3};
        int count = countSubSetswithSumK(array, k, 0, 0);
        System.out.println("count:"+ count);
    }

    private static int countSubSetswithSumK(int[] array, int k, int index, int count) {
        if (index == array.length) {
            return count == k ? 1 : 0;
        }
        int include= countSubSetswithSumK(array,k,index + 1, count + array[index]);
        int exclude = countSubSetswithSumK(array,k,index + 1, count);
        return include + exclude;
    }
}
