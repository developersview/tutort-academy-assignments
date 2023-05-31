import java.util.Arrays;
import java.util.Stack;

/**
 * @author pranoy.chakraborty
 * @Date 31/05/2023
 */
public class QuestionElevenSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1, 2, 3, 4, 3})));
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{5,4,3,2,1})));
    }

    static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        for (int i = (2 * n)-1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (!stack.empty()) {
                    result[i] = stack.peek();
                } else {
                    result[i] = -1;
                }
            }
            stack.push(nums[i % n]);
        }
        return result;
    }
}
