/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class QuestionNineSolution {
    public static void main(String[] args) {
        System.out.println(findSumOfSeries(5));
        System.out.println(findSumOfSeries(10));
        System.out.println(findSumOfSeries(1));
    }

    public static int findSumOfSeries(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
}
