/**
 * @author pranoy.chakraborty
 * @Date 11/06/2023
 */
public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(myPow(2.0000, 5));
        System.out.println(myPow(2.000,-2));
    }

    static double myPow(double x, int n) {
        double temp;
        if (n == 0) return 1;
        temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else if (n > 0) {
            return x * temp * temp;
        } else {
            return temp * temp / x;
        }
        /*if (n == 0) {
            return 1;
        }
        return x * myPow(x, n - 1);*/
    }

}
