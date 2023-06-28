import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 27/06/2023
 */
public class SortColors {
    public static void main(String[] args) {
        int[] arr1 = {2, 0, 2, 1, 1, 0};
        sortColor(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void sortColor(int[] nums) {
        int zero = 0, one = 0, two = 0;

        for (int num : nums) {
            if (num == 0) zero++;
            else if (num == 1) one++;
            else if (num == 2) two++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zero != 0) {
                nums[i] = 0;
                zero--;
            } else if (one != 0) {
                nums[i] = 1;
                one--;
            } else {
                nums[i] = 2;
            }
        }
    }
}
