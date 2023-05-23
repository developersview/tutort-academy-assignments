import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 24/05/2023
 */
public class QuestionElevenSolution {
    public static void main(String[] args) {
        System.out.println(findThreeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    static List<List<Integer>> findThreeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        if (nums.length == 0) return new ArrayList<>(result);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == -nums[i]) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > -nums[i]) k--;
                else if (sum < -nums[i]) j++;
            }
        }
        return new ArrayList<>(result);
    }
}
