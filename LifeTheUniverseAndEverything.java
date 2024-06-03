import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;
        
        while (true) {
            num = sc.nextInt();
            if (num == 42) {
                break;
            }
            System.out.println(num);
        }
    }
}
