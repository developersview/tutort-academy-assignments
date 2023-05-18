/**
 * @author pranoy.chakraborty
 * @Date 19/05/2023
 */
public class QuestionSixSolution {
    public static void main(String[] args) {
        System.out.println(findThirdMax(new int[]{3, 2, 1}));
    }

    static int findThirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }
        return (thirdMax == Long.MIN_VALUE) ? (int) max : (int) thirdMax;
    }
}
