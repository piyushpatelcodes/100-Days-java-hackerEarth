import java.util.Scanner;

// best solution -- fully accepted

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean flag = true;

        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);

            if( (Character.isDigit(ch)) && (Character.isDigit(ch2))){
                int sum = ch + ch2;
                if(sum%2!=0){
                    flag = false; break;
                }
            }

            char alpha = s.charAt(2);
            if(isVowel(alpha)){
                flag = false; break;
            }
        }

        if(flag){
            System.out.println("valid");
            return;
        }
        System.out.println("invalid");

        
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (char vowel : vowels) {
            if (ch == vowel) {
                return true;
            }
        }
        return false;
    }
}
