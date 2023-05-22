import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 23/05/2023
 */
public class QuestionFourSolution {
    public static void main(String[] args) {
        System.out.println(pascalTriangle(4));
        System.out.println(pascalTriangle(6));
    }

    static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
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
        return result;
    }
}
