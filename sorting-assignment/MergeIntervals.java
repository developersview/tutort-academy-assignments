import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 30/06/2023
 */
    /*Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].*/

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        //Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        //Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (ans.get(ans.size() - 1)[1] >= intervals[i][0]) {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size() - 1][]);
    }
}
