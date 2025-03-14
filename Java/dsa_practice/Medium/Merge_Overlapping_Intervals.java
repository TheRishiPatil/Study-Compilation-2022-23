import java.util.Arrays;
import java.util.Comparator;

public class Merge_Overlapping_Intervals {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[][] ans = new int[intervals.length][2];
        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];
        int idx = 0;
        for (int i = 1; i < intervals.length; i++) {
            int currStart = ans[idx][0], currEnd = ans[idx][1], nextStart = intervals[i][0], nextEnd = intervals[i][1];
            if (currEnd >= nextStart) {
                ans[idx][0] = Math.min(currStart, nextStart);
                ans[idx][1] = Math.max(currEnd, nextEnd);
            } else {
                idx++;
                ans[idx][0] = nextStart;
                ans[idx][1] = nextEnd;
            }
        }
        return Arrays.copyOf(ans, idx + 1);
    }
}
