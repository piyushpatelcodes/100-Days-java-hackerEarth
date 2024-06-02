import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    private static final int MOD = 998244353;

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[m];

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                B[i] = sc.nextInt();
            }
            int Q = sc.nextInt();
            int[][] queries = new int[Q][3];
            for (int i = 0; i < Q; i++) {
                queries[i][0] = sc.nextInt();
                queries[i][1] = sc.nextInt();
                queries[i][2] = sc.nextInt();
            }
            List<Long> results = array_queries(n,m, A, B, Q, queries);
            for (long result : results) {
                System.out.print(result + " ");
            }
            System.out.println();
        }
        sc.close();
        
    }

  // main SOLUTION codre
  // time = O((Q+1)*N*M),    space = O(N+M+Q)
  
    public static List<Long> array_queries(int N, int M, int[] A, int[] B, int Q, int[][]queries){

        List<Long> results = new ArrayList<>();
        long currentF = compute(N,M,A,B);
        results.add(currentF);

        for(int[] query : queries){
            int type = query[0];
            int i = query[1] - 1;
            int j = query[2] - 1;

            if(type == 1){
                int temp = A[i];
                A[i] = B[j];
                B[j] = temp;
            } else if (type == 2) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            } else if (type == 3) {
                int temp = B[i];
                B[i] = B[j];
                B[j] = temp;
            }

            currentF = compute(N, M, A, B);
            results.add(currentF);
        }
        return results;

    }


    private static long compute(int N, int M, int[] A, int[] B){
        long F=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                F += (long) (i + 1 + j + 1) * A[i] * B[j];
                F %= MOD;
            }
        }
        return F;
    }
        
        
    
}
