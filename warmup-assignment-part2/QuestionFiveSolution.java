/**
 * @author pranoy.chakraborty
 * @Date 16/05/2023
 */
public class QuestionFiveSolution {
    public static void main(String[] args) {
        System.out.println(jewelsAndStonesMethod1("aA", "aAABbBBBbb"));
        System.out.println(jewelsAndStonesMethod2("aAb", "aAABbBBBbb"));
        System.out.println(jewelsAndStonesMethod2("z", "ZZ"));
    }

    static int jewelsAndStonesMethod1(String jewels, String stones) {
        int count = 0;
        for (char c1 : jewels.toCharArray()) {
            for (char c2 : stones.toCharArray()) {
                if (c1 == c2) count++;
            }
        }
        return count;
    }

    static int jewelsAndStonesMethod2(String jewels, String stones) {
        int n = stones.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (jewels.indexOf(stones.charAt(i)) > -1) count++;
        }
        return count;
    }
}
