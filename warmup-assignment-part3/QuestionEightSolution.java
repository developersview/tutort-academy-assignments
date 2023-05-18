/**
 * @author pranoy.chakraborty
 * @Date 19/05/2023
 */
public class QuestionEightSolution {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }

    static int addDigits(int num) {
        if (num == 0) return 0;
        return (num % 9 == 0) ? 9 : num % 9;
    }
}
