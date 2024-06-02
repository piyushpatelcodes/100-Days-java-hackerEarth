import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        long MOD = 1000000007;
        long product = 1;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            product = (product * num) % MOD;
        }
        
        System.out.println(product);
    }
}
