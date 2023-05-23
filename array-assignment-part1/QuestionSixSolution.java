/**
 * @author pranoy.chakraborty
 * @Date 23/05/2023
 */
public class QuestionSixSolution {
    public static void main(String[] args) {
        System.out.println(findProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(findProfit(new int[]{7, 6, 4, 3, 1}));
    }

    static int findProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
