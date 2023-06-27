import java.util.*;

/**
 * @author pranoy.chakraborty
 * @Date 07/06/2023
 */
public class DisappearedNumber {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumber(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    static List<Integer> findDisappearedNumber(int[] nums) {
        /*List<Integer> result = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                result.add(i);
            }
        }
        return result;*/
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -1 * Math.abs(nums[index]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
