package DSAProblems.interviewPrep.dsaMostAsked;

public class ProductOfArrayExceptItSelf {
    public static void main(String[] args) {
        int[] array = {1,0,2,4,5};
        int[] productArray = productOfArrayExceptSelf(array);
     }

    private static int[] productOfArrayExceptSelf(int[] array) {
        int product = 1;
        int zeroCount = 0;
        int[] productArray = new int[array.length];
        for (int i = 0; i < array.length ; i++){
            if (array[i] == 0){
                zeroCount++;
            }else { product *= array[i];}
        }
        for (int j =0; j < array.length; j++){
            if (zeroCount ==1 && array[j] != 0){
                productArray[j] = 0;
            }else if (zeroCount ==1 && array[j] == 0){
                productArray[j] = product;
            }else if (zeroCount >= 2){
                productArray[j] = 0;
            }else {
                productArray[j] = (product / array[j]);
            }
        }
        return  productArray;
     }
}
