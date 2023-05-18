/**
 * @author pranoy.chakraborty
 * @Date 18/05/2023
 */
public class QuestionOneSolution {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(32));
        System.out.println(isHappy(15));
    }

    private static boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        if (n < 10) return false;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return isHappy(sum);
    }
}