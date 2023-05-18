/**
 * @author pranoy.chakraborty
 * @Date 19/05/2023
 */
public class QuestionFiveSolution {
    public static void main(String[] args) {
        QuestionFiveSolution solution = new QuestionFiveSolution();
        System.out.println(solution.reverseVowels("Hello"));
        System.out.println(solution.reverseVowels("Leetcode"));
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] cArray = s.toCharArray();
        while (i < j) {
            if (!isVowel(cArray[i])) {
                i++;
                continue;
            }
            if (!isVowel(cArray[j])) {
                j--;
                continue;
            }
            char temp = cArray[i];
            cArray[i] = cArray[j];
            cArray[j] = temp;

            i++; j--;
        }
        return new String(cArray);
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U'
        );
    }
}
