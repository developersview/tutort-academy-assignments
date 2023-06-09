import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 09/06/2023
 */
public class SingleNumberIII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }

    static int[] singleNumber(int[] nums) {
        //find xor of two numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        //find the number where lowest bit = 1
        int lowestBit = xor & (-xor);
        //group elements based on lowest bit, take and of lowest bit and the num
        // if 0 then first number if 1, then 2nd number
        int a = 0, b = 0;
        for (int num : nums) {
            if ((lowestBit & num) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
