package DSAProblems.TwoDArrays;

import java.util.Arrays;

public class Flatten2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        flattenTheArray(matrix);
    }

    private static void flattenTheArray(int[][] matrix) {
        int[] flattenArray = new int[matrix.length * matrix[0].length];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                flattenArray[k] = matrix[i][j];
                k++;
            }
        }
        System.out.println( Arrays.toString(flattenArray));
    }
}
