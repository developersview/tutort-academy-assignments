/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class BonusQuestionSolution {
    public static void main(String[] args) {
        System.out.println(findBalanceValue(4, new int[]{1, 5, 3, 2}));
        System.out.println(findBalanceValue(6, new int[]{1, 2, 1, 2, 1, 3}));
    }

    public static int findBalanceValue(int N, int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < N / 2; i++) {
            leftSum += arr[i];
        }
        for (int i = N / 2; i < N; i++) {
            rightSum += arr[i];
        }
        if (leftSum > rightSum) return leftSum - rightSum;
        return rightSum - leftSum;
    }
}