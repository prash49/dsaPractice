package DSAProblems.TwoDArrays;

import java.util.Arrays;

public class Rotate90Degree {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // now rotate the matrix 90 that looks like
        int[][] outputMatrix = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        System.out.println("90 degree rotated matrix:");
         rotateMatrix90Degree(matrix);
        printMatrix(matrix);
    }

    private static void rotateMatrix90Degree(int[][] matrix) {
        // first approach 90 means u can see in the out that rows converted to columns and reverse each row
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // now swap matrix[i][j] with matrix[j][i]
                swapMatrix(matrix, i, j);
            }
            System.out.println("swap Print :");
//            printMatrix(matrix);
            // now reverse each row;
        }
        for (int k = 0; k < n; k++) {
            int left = 0, right = n - 1;
            while (left < right) {
                swapMatrixRows(matrix, k, left, right);
                left++;
                right--;
            }
        }


    }

    private static void swapMatrixRows(int[][] matrix, int k, int left, int right) {
        int temp = matrix[k][left];
        matrix[k][left] = matrix[k][right];
        matrix[k][right] = temp;
    }


    private static void swapMatrix(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;

    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
                System.out.println();
            }
        }
    }
}
