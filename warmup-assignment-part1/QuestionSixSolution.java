/**
 * @author pranoy.chakraborty
 * @Date 08/05/2023
 */
public class QuestionSixSolution {
    public static void main(String[] args) {
        System.out.println(decidePerfectArray(new int[]{1, 2, 3, 2, 1}));
        System.out.println(decidePerfectArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(decidePerfectArray(new int[]{7, 8, 9, 10, 11, 10, 9, 8, 7}));
    }

    public static String decidePerfectArray(int[] Arr) {
        if (Arr == null || Arr.length == 0) return null;
        int length = Arr.length;
        int[] reverseArray = new int[length];
        int j = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverseArray[j] = Arr[i];
            j++;
        }
        for (int i = 0; i < length; i++) {
            if (Arr[i] != reverseArray[i]) return "NOT PERFECT";
        }
        return "PERFECT";
    }
}