import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 13/06/2023
 */
public class MinimumProductOfNonZeroElement {

    public static long mod = (int) (1e9 + 7);

    public static void main(String[] args) {
        System.out.println(minNonZeroProduct(2));
        System.out.println(minNonZeroProduct(3));
        System.out.println(minNonZeroProduct(54));
    }

    static int minNonZeroProduct(int p) {
        long max = (long) (Math.pow(2, p) - 1);
        long power = myPow(max - 1, (max - 1) / 2);
        power = ((power % mod) * (max % mod)) % mod;
        return (int) power;
    }

    static long myPow(long x, long y) {
        long temp = 1;
        if (y == 0) return 1;
        temp = myPow(x, y / 2);
        temp = temp % mod;
        if (y % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (((temp * temp) % mod) * (x % mod)) % mod;
        }
    }
}
