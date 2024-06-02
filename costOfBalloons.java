import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// time = O(t*n)

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int greenCost = sc.nextInt();
            int purpleCost = sc.nextInt();
            int n = sc.nextInt();

            int[][] participants = new int[n][2];
            for (int i = 0; i < n; i++) {
                participants[i][0] = sc.nextInt();
                participants[i][1] = sc.nextInt();
            }

            int greenFirstCost = 0;
            int purpleFirstCost = 0;
            
            for (int i = 0; i < n; i++) {
                if (participants[i][0] == 1) {
                    greenFirstCost += greenCost;
                    purpleFirstCost += purpleCost;
                }
                if (participants[i][1] == 1) {
                    greenFirstCost += purpleCost;
                    purpleFirstCost += greenCost;
                }
            }
            
            System.out.println(Math.min(greenFirstCost, purpleFirstCost));
        }
    }
}
