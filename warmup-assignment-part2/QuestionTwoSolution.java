import java.util.ArrayList;

/**
 * @author pranoy.chakraborty
 * @Date 16/05/2023
 */
/*Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

Example :
1
1 1
1 2 1
1 3 3 1
For N = 3, return 3rd row i.e 1 2 1
* */
public class QuestionTwoSolution {
    public static void main(String[] args) {
       System.out.println(nThRowOfPascalTriangle(17));
    }

    //to print whole pascal triangle
    private static void pascalTriangle(int N) {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));
            }
            System.out.println();
        }
    }

    private static long factorial(long i) {
        if (i == 0) return 1;
        return i * factorial(i - 1);
    }

    //to get the nth row of pascal triangle
    private static ArrayList<Long> nThRowOfPascalTriangle(int N) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == N - 1)
                    arrayList.add((factorial(i) / (factorial(i - j) * factorial(j))));
            }
        }
        return arrayList;
    }
}
