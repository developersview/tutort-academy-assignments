/**
 * @author pranoy.chakraborty
 * @Date 11/06/2023
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
    }

    static boolean isPowerOfTwo(int n) {
        //method 1: using bitwise operation
        //return (n > 0) && ((n & n - 1) == 0);

        //method 2: using recursion
        if (n == 1) {
            return true;
        } else if (n % 2 != 0 || n == 0) {
            return false;
        } else {
            return isPowerOfTwo(n / 2);
        }
    }
}
