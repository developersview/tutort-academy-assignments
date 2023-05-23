import java.util.Arrays;
import java.util.HashMap;

/**
 * @author pranoy.chakraborty
 * @Date 23/05/2023
 */
public class QuestionEightSolution {
    public static void main(String[] args) {
        System.out.println(findMajorityElementMethod1(new int[1]));
        System.out.println(findMejorityElementMethod2(new int[]{2,2,1,1,1,2,2}));
    }

    //TC -> O(n), SC -> O(n)
    static int findMajorityElementMethod1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]) + 1;
                if (count > nums.length / 2) {
                    return nums[i];
                } else {
                    map.put(nums[i], count);
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return 1;
    }

    //TC -> O(nLogn), SC -> O(1)
    static int findMejorityElementMethod2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
