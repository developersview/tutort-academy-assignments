/**
 * @author pranoy.chakraborty
 * @Date 16/05/2023
 */
public class QuestionSevenSolution {
    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdd(new int[]{2, 6, 4, 1}));
        System.out.println(threeConsecutiveOdd(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
        System.out.println(threeConsecutiveOdd(new int[]{1, 2, 1, 1}));
    }

    static boolean threeConsecutiveOdd(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
                continue;
            }
            count = 0;
        }
        return false;
    }
}
