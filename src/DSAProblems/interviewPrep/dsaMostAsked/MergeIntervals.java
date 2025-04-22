package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int[][] merged = merge(intervals);
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        
        // Sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the next, merge them
            if (intervals[i][0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                merged.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        
        merged.add(currentInterval);
        return merged.toArray(new int[merged.size()][]);
    }
}