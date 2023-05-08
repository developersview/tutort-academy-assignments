import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class QuestionSevenSolution {
    public static void main(String[] args) {
        System.out.println(findLeftElementMethod1(7, new int[]{7, 8, 3, 4, 2, 9, 5}));
        System.out.println(findLeftElementMethod2(8, new int[]{8, 1, 2, 9, 4, 3, 7, 5}));
        System.out.println(findLeftElementMethod1(7, new int[]{9, 11, 1, 4, 8, 6, 1}));
        System.out.println(findLeftElementMethod1(6, new int[]{1, 2, 3, 3, 4, 5}));
        System.out.println(findLeftElementMethod1(6, new int[]{1, 2, 3, 4, 5, 5}));
    }

    //Sort using bubble sort method, then find the last remaining element
    public static int findLeftElementMethod1(int N, int[] A) {
        for (int i = 0; i <= N - 1; i++) {
            for (int j = i; j <= N - 1; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(A));
        if (N % 2 == 0) return A[(N / 2) - 1];
        return A[N / 2];
    }

    //sort using Arrays.sort() method
    public static int findLeftElementMethod2(int N, int[] A) {
        Arrays.sort(A);
        if (N % 2 == 0) return A[(N / 2) - 1];
        return A[N / 2];
    }
}