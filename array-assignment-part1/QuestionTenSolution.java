import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 23/05/2023
 */
public class QuestionTenSolution {
    public static void main(String[] args) {
        System.out.println(findMissingElements(new int[]{3, 1, 2, 4, 10}, 2, 10));
    }

    static List<Integer> findMissingElements(int[] nums, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = low; i <= high; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
