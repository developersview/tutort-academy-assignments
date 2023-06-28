import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 28/06/2023
 */
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[1000];
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
