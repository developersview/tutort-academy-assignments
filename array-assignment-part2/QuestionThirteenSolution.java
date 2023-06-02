import java.util.*;

/**
 * @author pranoy.chakraborty
 * @Date 02/06/2023
 */
public class QuestionThirteenSolution {
    public static void main(String[] args) {
        System.out.println(minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
    }

    static int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> freqs = new ArrayList<>(map.values());
        freqs.sort(Collections.reverseOrder());
        int count = 0;
        int totalElement = arr.length;
        int i = 0;
        while (totalElement > arr.length / 2) {
            totalElement = totalElement - freqs.get(i);
            i++;
            count++;
        }
        return count;
    }
}
