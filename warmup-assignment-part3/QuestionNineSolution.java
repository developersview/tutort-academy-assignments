/**
 * @author pranoy.chakraborty
 * @Date 19/05/2023
 */
public class QuestionNineSolution {
    public static void main(String[] args) {
        System.out.println(getLucky("iiii",1));
        System.out.println(getLucky("leetcode",2));
        System.out.println(getLucky("zbax",3));
    }

    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((s.charAt(i) - 'a') + 1);
        }

        String result = sb.toString();
        if (result.length() == 1) {
            return Character.getNumericValue(result.charAt(0));
        }

        int sum = 0;
        while (k > 0 && result.length() > 1) {
            sum = 0;
            for (int i = 0; i < result.length(); i++)
                sum += Character.getNumericValue(result.charAt(i));

            result = String.valueOf(sum);
            k--;
        }
        return sum;
    }
}
