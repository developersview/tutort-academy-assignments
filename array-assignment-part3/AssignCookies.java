import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 07/06/2023
 */
public class AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2,3}, new int[]{1, 1}));
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                contentChildren++;
                i++;
            }
            j++;
        }
        return contentChildren;
    }
}
