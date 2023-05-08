/**
 * @author pranoy.chakraborty
 * @Date 07/05/2023
 */
public class QuestionOneSolution {
    public static void main(String[] args) {
        System.out.println(sumOfAllIntegers(4, new int[]{1, 2, 3, 4}));
        System.out.println(sumOfAllIntegers(6, new int[]{5, 8, 3, 10, 22, 45}));
        System.out.println(sumOfAllIntegers(8, new int[]{}));
    }

    public static int sumOfAllIntegers(int n, int[] array) {
        int sum = 0;
        if (array == null || array.length == 0) return sum;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }
}
