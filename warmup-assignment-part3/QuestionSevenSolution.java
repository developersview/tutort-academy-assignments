/**
 * @author pranoy.chakraborty
 * @Date 19/05/2023
 */
public class QuestionSevenSolution {
    public static void main(String[] args) {
        QuestionSevenSolution solution =new QuestionSevenSolution();
        System.out.println(solution.findTheDifference("abcd","abecd"));
    }

    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char ch : s.toCharArray()) {
            c ^= ch;
        }
        for (char ch : t.toCharArray()) {
            c ^= ch;
        }
        return c;
    }
}