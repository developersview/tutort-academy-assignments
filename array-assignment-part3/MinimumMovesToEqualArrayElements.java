/**
 * @author pranoy.chakraborty
 * @Date 07/06/2023
 */
public class MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{1, 2, 3}));
    }

    static int minMoves(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }
        return sum - (min * nums.length);
    }
}
