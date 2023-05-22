import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 23/05/2023
 */
public class QuestionFiveSolution {
    public static void main(String[] args) {
        System.out.println(pascalTriangleFindRow(1));
        System.out.println(pascalTriangleFindRow(3));
        System.out.println(pascalTriangleFindRow(0));
        System.out.println(generateNthRow(30));
    }

    static List<Integer> pascalTriangleFindRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1).get(j)
                        + result.get(i - 1).get(j - 1)
                );
            }
            if (i > 0) row.add(1);
            result.add(row);
        }
        return result.get(rowIndex);
    }

    /* using NC0, NC1, ......, NCN - 1, NCN
     * NCr = NC(r - 1) * (N - r + 1)) / r
     */
    static List<Integer> generateNthRow(int rowIndex) {
        int prevElement = 1;
        List<Integer> result = new ArrayList<>();
        result.add(prevElement);
        if (rowIndex == 0) return result;
        for (int i = 1; i <= rowIndex; i++) {
            long currElement = ((long) prevElement * (rowIndex - i + 1) / i);
            prevElement = (int) currElement;
            result.add(prevElement);
        }
        return result;
    }
}
