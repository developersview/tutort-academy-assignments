import java.util.Arrays;
/**
 * @author pranoy.chakraborty
 * @Date 29/05/2023
 */
public class QuestionOneSolution {
    public static void main(String[] args) {
        int[] nums1 = {0,1,0,3,12};
        moveZeros(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    static void moveZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
}
