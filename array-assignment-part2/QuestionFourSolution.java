import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 29/05/2023
 */
public class QuestionFourSolution {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) i++;
            if (start != nums[i]) {
                list.add(start + "->" + nums[i]);
            } else {
                list.add("" + start);
            }
        }
        return list;
    }
}
