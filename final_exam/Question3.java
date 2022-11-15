package final_exam;

/*
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 *
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

import java.util.Arrays;
import java.util.LinkedList;

public class Question3 {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {

        if(intervals.length < 2)
            return intervals;

        LinkedList<int[]> nonOverlappingIntervals = new LinkedList<>();

        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));


        for(int[] intv : intervals){
            // If no interval or if end time of first interval < with start time of next interval
            if(nonOverlappingIntervals.isEmpty() ||
                    nonOverlappingIntervals.getLast()[1] < intv[0])
                nonOverlappingIntervals.add(intv);
            else
                // Get max time of overlapping intervals
                nonOverlappingIntervals.getLast()[1] = Math.max(nonOverlappingIntervals.getLast()[1], intv[1]);
        }

        return nonOverlappingIntervals.toArray(new int[nonOverlappingIntervals.size()][]);
    }



}
