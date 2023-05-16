import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 16/05/2023
 */
public class QuestionSixSolution {
    public static void main(String[] args) {
        System.out.println(minimumAbsDiff(new int[]{4, 2, 3, 1}));
        System.out.println(minimumAbsDiff(new int[]{1, 3, 6, 10, 15}));
        System.out.println(minimumAbsDiff(new int[]{3, 8, -10, 23, 19, -4, -14, 27}));
    }

    static List<List<Integer>> minimumAbsDiff(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            diff = Math.min(diff, arr[i + 1] - arr[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == diff) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
}
