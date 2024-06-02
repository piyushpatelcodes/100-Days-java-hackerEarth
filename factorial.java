import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextInt();
        long result = 1;

        for(long i=1; i<=n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
