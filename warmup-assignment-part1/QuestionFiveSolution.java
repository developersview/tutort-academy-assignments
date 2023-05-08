/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class QuestionFiveSolution {
    public static void main(String[] args) {
        findElementsEqualToIndex(5, new int[]{15, 2, 45, 12, 7});
        System.out.println();
        findElementsEqualToIndex(1, new int[]{1});
        System.out.println();
        findElementsEqualToIndex(8, new int[]{45, 78, 3, 4, 5, 41, 89, 8});
    }

    public static void findElementsEqualToIndex(int N, int[] Arr) {
        for (int i = 0; i < N; i++) {
            if (i + 1 == Arr[i]) System.out.print(Arr[i]);
        }
    }
}
