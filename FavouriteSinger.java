import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// time = O(n),   space = O(n)

public class FavouriteSingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] singers = new long[n];
        for (int i = 0; i < n; i++) {
            singers[i] = scanner.nextLong();
        }

        // Create a HashMap to store the frequency of each singer
        HashMap<Long, Integer> frequencyMap = new HashMap<>();

        int maxFrequency = 0;
        int maxFrequencyCount = 0;

        for (long singer : singers) {
            int newFrequency = frequencyMap.getOrDefault(singer, 0) + 1;
            frequencyMap.put(singer, newFrequency);

            if (newFrequency > maxFrequency) {
                maxFrequency = newFrequency;
                maxFrequencyCount = 1;
            } else if (newFrequency == maxFrequency) {
                maxFrequencyCount++;
            }
        }

        System.out.println(maxFrequencyCount);

        scanner.close();
    }
}
