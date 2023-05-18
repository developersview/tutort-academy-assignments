/**
 * @author pranoy.chakraborty
 * @Date 18/05/2023
 */
public class QuestionFourSolution {
    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(14));
        System.out.println(isUgly(8));
    }

    //time complexity -> O(logn)
    static boolean isUgly(int n) {
        if (n == 0) return false;
        for (int i = 2; i <= 5; i += i - 1) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }
}
