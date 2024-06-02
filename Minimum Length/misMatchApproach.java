import java.util.Scanner;
// best approach . time = O(n), space = O(n)
// Time (sec) = 8.52165   ,   Memory (KiB) = 161800

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Read the number of test cases
        while (t-- > 0) { // Loop to handle multiple test cases
            int n = scanner.nextInt(); // Read the size of the arrays
            int[] A = new int[n]; // Initialize array A
            int[] B = new int[n]; // Initialize array B
            
            // Read elements of array A
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            // Read elements of array B
            for (int i = 0; i < n; i++) {
                B[i] = scanner.nextInt();
            }
            
            // Proceed to find the minimum subarray length needed to sort
            int minSubarrayLength = findMinSubarrayLength(A, B, n);
            System.out.println(minSubarrayLength); // Print the result for the current test case
        }

        scanner.close(); // Close the scanner object
    }
    
    public static int findMinSubarrayLength(int[] A, int[] B, int n) {
        // Step 2: Identify the first and last mismatch indices
        int left = 0; // Initialize left pointer
        int right = n - 1; // Initialize right pointer

        // Find the first mismatch from the left
        while (left < n && A[left] == B[left]) {
            left++;
        }

        // Find the first mismatch from the right
        while (right >= 0 && A[right] == B[right]) {
            right--;
        }

        // Step 3: Calculate the length of the subarray to sort
        if (left >= right) {
            return 0; // Arrays are already the same
        } else {
            return right - left + 1;
        }
    }
}
