import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int t = sc.nextInt();
        while(t-- >0){
            int W = sc.nextInt();
            int  H = sc.nextInt();

            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } else if (W == H) {
                System.out.println("ACCEPTED");
            } else {
                System.out.println("CROP IT");
            }
        }
    }
}
