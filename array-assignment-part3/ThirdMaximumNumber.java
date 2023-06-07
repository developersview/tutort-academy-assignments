/**
 * @author pranoy.chakraborty
 * @Date 07/06/2023
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(findThirdMaximum(new int[]{2, 2, 3, 1}));
    }

    static int findThirdMaximum(int[] nums) {
        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max3 = max2;
                max2 = max;
                max = num;
            } else if (num > max2 && num < max) {
                max3 = max2;
                max2 = num;
            } else if (num > max3 && num < max2) {
                max3 = num;
            }
        }
        int result = (int) ((max3 == Long.MIN_VALUE) ? max : max3);
        return result;
    }
}
