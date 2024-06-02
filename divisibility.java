import java.util.Scanner;

// time = O(1),  space = O(n)

public class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Extract the last element of the array
        int lastNumber = arr[n - 1];
        
        // Check the last digit of the last number
        if (lastNumber % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
