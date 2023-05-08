import java.util.ArrayList;
import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class QuestionFourSolution {
    public static void main(String[] args) {
        printElementsInAlternativeOrderMethod1(4, new int[]{1, 2, 3, 4});
        System.out.println();
        printElementsInAlternativeOrderMethod2(5, new int[]{1, 2, 3, 4, 5});
    }

    //method 1: print the alternative number directly by traversing the array
    private static void printElementsInAlternativeOrderMethod1(int N, int[] A) {
        for (int i = 0; i < N; i = i + 2) {
            System.out.print(A[i]);
        }
    }

    //method 2: Traverse the array, store alternative number in a arraylist or array then print it
    private static void printElementsInAlternativeOrderMethod2(int N, int[] A) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i = i + 2) {
            result.add(A[i]);
        }
        result.forEach((element) -> System.out.print(element + " "));
    }
}
