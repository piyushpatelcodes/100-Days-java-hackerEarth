import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(input.equals(reverse(input))){
            System.out.println("YES"); return;
        }
        System.out.println("NO"); 

    }
    private static String reverse(String str){
        String nstr="";
        for (int i=0; i<str.length(); i++){
            char ch= str.charAt(i); 
            nstr= ch+nstr; 
            //adds each character in front of the existing string
        }
        return nstr;
    }
}
