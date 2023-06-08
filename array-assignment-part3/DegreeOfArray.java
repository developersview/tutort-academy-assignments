import java.util.HashMap;
import java.util.Map;

/**
 * @author pranoy.chakraborty
 * @Date 08/06/2023
 */
public class DegreeOfArray {
    public static void main(String[] args) {

    }

    static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxCount = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            maxCount = Math.max(maxCount, map.get(key));
        }
        return 0;
    }
}
