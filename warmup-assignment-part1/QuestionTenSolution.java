/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class QuestionTenSolution {
    public static void main(String[] args) {
        System.out.println(checkFascinatingNumber(192));
        System.out.println(checkFascinatingNumber(853));
    }

    public static String checkFascinatingNumber(int N) {
        int multiplyResult1 = N * 2;
        int multiplyResult2 = N * 3;
        String concatenatedResult = String.valueOf(N) + multiplyResult1 + multiplyResult2;
        for (int i = 1; i <= 9; i++) {
            if (!concatenatedResult.contains(String.valueOf(i))) return "Not Fascinating";
        }
        return "Fascinating";
    }
}
