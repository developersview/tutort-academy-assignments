/**
 * @author pranoy.chakraborty
 * @Date 16/05/2023
 */
public class QuestionOneSolution {
    public static void main(String[] args) {
        System.out.println(reverseNumber(153));
        System.out.println(reverseNumber(-4861));
        System.out.println(reverseNumber(-84959100));
    }

    //method to reverse the number
    private static int reverseNumber(int N) {
        int reverse = 0, reminder = 0;
        boolean isNegative = N < 0;
        if (isNegative) N = N * (-1);
        while (N > 0) {
            reminder = N % 10;
            reverse = reverse * 10 + reminder;
            N /= 10;
        }
        if (isNegative) reverse = reverse * (-1);
        return reverse;
    }
}
