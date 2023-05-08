import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class QuestionEightSolution {
    public static void main(String[] args) {
        findElementsExceptTwoGreatest(new int[]{2, 8, 7, 1, 5});
        System.out.println();
        findElementsExceptTwoGreatest(new int[]{7, -2, 3, 4, 9, -1});
    }

    public static void findElementsExceptTwoGreatest(int[] a) {
        int len = a.length;
        sort(len, a);
        for (int i = 0; i < len - 2; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //method to sort the array
    public static void sort(int len, int[] arr) {
        for (int i = 0; i <= len - 1; i++) {
            for (int j = i; j <= len - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
