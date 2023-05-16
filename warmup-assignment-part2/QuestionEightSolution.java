import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 16/05/2023
 */
public class QuestionEightSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{0, 1, 0, 3, 12})));
        System.out.println(Arrays.toString(moveZeros(new int[]{0, -18, -22, 3, 12, 0, 0, 2, 9, 15})));
    }

    static int[] moveZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
        return nums;
    }
}
