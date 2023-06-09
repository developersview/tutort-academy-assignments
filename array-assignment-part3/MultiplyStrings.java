/**
 * @author pranoy.chakraborty
 * @Date 09/06/2023
 */
public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }

    static String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        if (m == 0 || n == 0 || "0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        if ("1".equals(num1)) {
            return num2;
        }
        if ("1".equals(num2)) {
            return num1;
        }
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                //adding previous values in result array into the product
                product += result[i + j + 1];

                //adding the new product into result array
                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int element : result) {
            if (sb.length() == 0 && element == 0) {
                continue;
            }
            sb.append(element);
        }
        return sb.toString();
    }
}
