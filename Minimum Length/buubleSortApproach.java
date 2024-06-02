import java.util.Scanner;

public class TestClass {
    // good approach but time limit exceed. time = O(n²). This Is BADDDD>..
    public static int bubbleSortAndCount(int[] arr) {
        int count = 0;
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                    count++;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = scanner.nextInt();
            }
            
    // Copy arrays to avoid modifying the original arrays while sorting
            int[] A_copy = A.clone();
            int[] B_copy = B.clone();
            
            int swapsA = bubbleSortAndCount(A_copy);
            int swapsB = bubbleSortAndCount(B_copy);

            System.out.println(Math.max(swapsA, swapsB));
        }

        scanner.close();
    }
}
