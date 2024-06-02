import java.util.*;
// time = O(1),   space = O(n)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        
        // Compute prefixMax
        prefixMax[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1], a[i]);
        }
        
        // Compute suffixMax
        suffixMax[n-1] = a[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1], a[i]);
        }
        
        // Process each query
        for (int qi = 0; qi < q; qi++) {
            int l = sc.nextInt() - 1; // Convert to 0-based index
            int r = sc.nextInt() - 1; // Convert to 0-based index
            
            int maxOutsideSubarray = -1;
            if (l > 0) {
                maxOutsideSubarray = Math.max(maxOutsideSubarray, prefixMax[l-1]);
            }
            if (r < n-1) {
                maxOutsideSubarray = Math.max(maxOutsideSubarray, suffixMax[r+1]);
            }
            
            System.out.println(maxOutsideSubarray);
        }
        
        sc.close();
    }
}
