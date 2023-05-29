import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 29/05/2023
 */
public class QuestionEightSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[20];
        for (int num : nums1) {
            count[num]++;
        }
        for (int num : nums2) {
            if (count[num] != 0) {
                list.add(num);
                count[num] = 0;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
