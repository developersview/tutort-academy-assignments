/**
 * @author pranoy.chakraborty
 * @Date 07/05/2023
 */
public class QuestionThreeSolution {
    public static void main(String[] args) {
        System.out.println(findNumberOfElementsLessThanOrEqual(
                6, new int[]{1, 2, 4, 5, 8, 10}, 9)
        );
        System.out.println(findNumberOfElementsLessThanOrEqual(
                7, new int[]{1, 2, 2, 2, 5, 7,9}, 2)
        );
    }

    public static int findNumberOfElementsLessThanOrEqual(int N, int[] A, int X) {
        if (A == null || A.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] <= X) count++;
        }
        return count;
    }
}
