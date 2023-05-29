import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 29/05/2023
 */
public class QuestionSevenSolution {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
