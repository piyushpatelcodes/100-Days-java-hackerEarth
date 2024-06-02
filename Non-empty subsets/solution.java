import java.util.Scanner;

// time = O(n),    space = O(1)

public class MinimumKForBitwiseOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Calculate the minimum element in the array
            int K = A[0];
            for (int i = 1; i < N; i++) {
                if (A[i] < K) {
                    K = A[i];
                }
            }

            // Print the result for this test case
            System.out.println(K);
        }

        scanner.close();
    }
}
