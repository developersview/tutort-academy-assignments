/**
 * @author pranoy.chakraborty
 * @Date 13/06/2023
 */
public class CountGoodNumbers {

    static long mod = (int) (1e9 + 7);

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
        System.out.println(countGoodNumbers(50));
    }

    static int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        return (int) ((myPow(5, even)) * (myPow(4, odd)) % mod);
    }

    static long myPow(long x, long y) {
        long temp = 1;
        if (y == 0) return 1;
        temp = myPow(x, y / 2);
        if (y % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (x * temp * temp) % mod;
        }
    }
}
