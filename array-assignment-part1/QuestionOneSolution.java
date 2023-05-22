import java.util.Arrays;
import java.util.HashMap;

/**
 * @author pranoy.chakraborty
 * @Date 22/05/2023
 */
public class QuestionOneSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwoSum(new int[]{2, 3, 17, 5, 8, 11, 9, 7}, 9)));
        System.out.println(Arrays.toString(findTwoSum(new int[]{2, 3, 17, 5, 8, 11, 7, 9}, 15)));
    }

    static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
