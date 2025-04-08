package DSAProblems.interviewPrep.wissen;

public class ContainsMostWater {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        containsMostWater(heights);
    }

    private static int containsMostWater(int[] heights) {
        // we institute two pointers here to find the area and height
        int left = 0, right = heights.length - 1;
        int maxArea =0;
        while (left < right){
            int h = Math.min(heights[left], heights[right]); // find min
            int w= right - left; // width is from left to right diffrence
            int area = h * w;
            maxArea = Math.max(maxArea,area);
            if (heights[left] < heights[right]){
                left++;
            }else {
                right --;
            }
        }
        return maxArea;
    }
}
