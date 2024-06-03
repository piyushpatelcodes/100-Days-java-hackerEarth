import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y'};

        int val1 = Character.getNumericValue(inputString.charAt(0));
        int val2 = Character.getNumericValue(inputString.charAt(1));
        int val3 = Character.getNumericValue(inputString.charAt(3));
        int val4 = Character.getNumericValue(inputString.charAt(4));
        int val5 = Character.getNumericValue(inputString.charAt(5));
        int val6 = Character.getNumericValue(inputString.charAt(7));
        int val7 = Character.getNumericValue(inputString.charAt(8));

        if (isVowel(inputString.charAt(2))) {
            System.out.println("invalid");
        } else if ((val1 + val2) % 2 != 0 || (val3 + val4) % 2 != 0 || (val4 + val5) % 2 != 0 || (val6 + val7) % 2 != 0) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
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
