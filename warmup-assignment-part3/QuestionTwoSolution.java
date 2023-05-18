/**
 * @author pranoy.chakraborty
 * @Date 18/05/2023
 */
public class QuestionTwoSolution {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(16));
        System.out.println(powerOfTwo(3));
    }

    static boolean powerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
