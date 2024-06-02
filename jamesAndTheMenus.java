import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// time = O(n * m),   space = O(m)

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] prices  = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                prices [i][j] = sc.nextInt();
            }
        }

        // find max value
        int[] maxPrices  = new int[m];
        for (int j = 0; j < m; j++) {
            int maxPrice = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (prices[i][j] > maxPrice) {
                    maxPrice = prices[i][j];
                }
            }
            maxPrices[j] = maxPrice;
        }

        // Count good prices and compute the average price for each menu
        int bestMenuIndex = -1;
        int maxGoodPrices = -1;
        double highestAveragePrice = -1.0;

        for(int i=0; i<n; i++){
            int goodPriceCount = 0;
            double totalPrice = 0.0;

            for (int j = 0; j < m; j++) {
                totalPrice += prices[i][j];
                if (prices[i][j] == maxPrices[j]) {
                    goodPriceCount++;
                }
            }

            double averagePrice = totalPrice / m;

            // finding best menu

            if (goodPriceCount > maxGoodPrices) {
                bestMenuIndex = i;
                maxGoodPrices = goodPriceCount;
                highestAveragePrice = averagePrice;
            } else if (goodPriceCount == maxGoodPrices && averagePrice > highestAveragePrice) {
                bestMenuIndex = i;
                highestAveragePrice = averagePrice;
            }
        }
        
        // Output the result (1-based index)
        System.out.println(bestMenuIndex + 1); sc.close();
    }
}
