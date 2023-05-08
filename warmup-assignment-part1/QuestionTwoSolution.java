/**
 * @author pranoy.chakraborty
 * @Date 07/05/2023
 */
public class QuestionTwoSolution {
    //main method
    public static void main(String[] args) {
        System.out.println(findElementAtIndex(5, 2, new int[]{10, 20, 30, 40, 50}));
        System.out.println(findElementAtIndex(7, 4, new int[]{10, 20, 30, 40, 50, 60, 70}));
        System.out.println(findElementAtIndex(8, 9, new int[]{}));
    }

    //method to find element at Kth position
    public static int findElementAtIndex(int N, int key, int[] A) {
        int element = 0;
        if (A == null || A.length == 0) return element;
        for (int i = 0; i < N; i++) {
            if (A[key] == A[i])
                element = A[i];
        }
        return element;
    }
}
