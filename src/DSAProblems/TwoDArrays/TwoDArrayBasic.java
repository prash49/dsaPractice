package DSAProblems.TwoDArrays;

public class TwoDArrayBasic {
    public static void main(String[] args) {
        //How to create  a 2D array
        int[][] matrix = {
                {1,2,3}, // first row
                {4,5,6},
                {7,8,9}
        };
        // row * colum
        // 3 rows are there
     int len =   matrix.length; // 3 rows hence 3 is the output
        int firstRowSize = matrix[0].length; // first matrix size 3
        // to access the 1 row which means at 0th index row and third element which is 2nd index value
        int val = matrix[0][2];

        //Common iteration pattern row wise
        for (int i = 0; i < matrix.length ; i++){
            for (int j = 0; j < matrix[0].length ; j++){
                System.out.println("row:"+ i + " column:" + j + " value:"+ matrix[i][j]);
            }
        }

        // Column wise
        for (int j = 0; j < matrix[0].length; j++){
            for (int i = 0; i < matrix.length; i ++){
                System.out.println("row:"+ i + " column:" + j + " value:"+ matrix[i][j]);
            }
        }

    }
}
