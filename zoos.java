import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        if (map.getOrDefault('o', 0) == 2 * map.getOrDefault('z', 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
