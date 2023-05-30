/**
 * @author pranoy.chakraborty
 * @Date 31/05/2023
 * https://leetcode.com/problems/next-greater-element-iii/solutions/3580067/java-best-solution-0-ms-beats-100-linear-time-comeplexity/
 */
public class QuestionTwelveSolution {
    public static void main(String[] args) {
        System.out.println(nextGreaterElementThree(12));
        System.out.println(nextGreaterElementThree(125431));
    }

    static int nextGreaterElementThree(int n) {
        char[] str = (n + "").toCharArray();
        int deflectionPoint = str.length - 1;
        //find out the deflection point
        while (deflectionPoint > 0) {
            if (str[deflectionPoint] > str[deflectionPoint - 1]) {
                break;
            }
            deflectionPoint--;
        }

        //if deflection point is 0 return -1
        if (deflectionPoint == 0) return -1;

        //find out 1st and 2nd swapping index
        int firstSwappingIndex = deflectionPoint - 1;
        int secondSwappingIndex = str.length - 1;

        while (firstSwappingIndex <= secondSwappingIndex) {
            if (str[firstSwappingIndex] < str[secondSwappingIndex]) {
                break;
            }
            secondSwappingIndex--;
        }

        //swap two elements
        char temp = str[firstSwappingIndex];
        str[firstSwappingIndex] = str[secondSwappingIndex];
        str[secondSwappingIndex] = temp;

        //reverse the rest element at point of deflection
        reverseChar(str, deflectionPoint);

        //convert the string to long and check Integer.MAX_VALUE and then return
        long result = Long.parseLong(new String(str));
        if (result > Integer.MAX_VALUE) return -1;
        return (int) result;
    }

    static void reverseChar(char[] str, int i) {
        int start = i;
        int end = str.length - 1;
        while (start <= end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
