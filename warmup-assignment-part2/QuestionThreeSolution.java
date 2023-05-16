/**
 * @author pranoy.chakraborty
 * @Date 16/05/2023
 */

public class QuestionThreeSolution {
    public static void main(String[] args) {
        System.out.println(richestWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println(richestWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        System.out.println(richestWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }

    private static int richestWealth(int[][] accounts) {
        int richest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (richest < sum) richest = sum;
        }
        return richest;
    }
}
