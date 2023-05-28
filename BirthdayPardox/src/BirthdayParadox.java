import java.util.*;

public class BirthdayParadox {
    public static void main(String[] args) {
        int[] testSizes = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };

        for (int n : testSizes) {
            int experiments = 10000; // Number of experiments to run
            int successCount = 0;   // Count of experiments where two people have the same birthday

            for (int i = 0; i < experiments; i++) {
                if (runExperiment(n)) {
                    successCount++;
                }
            }

            double probability = (double) successCount / experiments;
            System.out.println("For n = " + n + ", probability: " + probability);
        }
    }

    // Runs a single experiment with 'n' people and checks if any two have the same birthday
    private static boolean runExperiment(int n) {
        Set<Integer> birthdays = new HashSet<>();

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int birthday = rand.nextInt(365) + 1; // Generate a random birthday from 1 to 365
            if (birthdays.contains(birthday)) {
                return true; // Two people have the same birthday
            }
            birthdays.add(birthday);
        }

        return false; // No two people have the same birthday
    }
}
