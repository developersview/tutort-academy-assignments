import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 22/05/2023
 */
public class QuestionTwoSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwoSumOfSortedArray(new int[]{2, 5, 7, 9, 11}, 9)));
        System.out.println(Arrays.toString(findTwoSumOfSortedArray(new int[]{2, 4, 5, 8, 9, 11}, 15)));
    }

    static int[] findTwoSumOfSortedArray(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            }
        }
        return null;
    }
}
