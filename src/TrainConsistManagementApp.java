import java.util.*;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 10: Count Total Seats in Train
 * ==========================================================
 * Description:
 * This class aggregates seating capacity of all bogies
 * into a single total using Stream reduce().
 * * @author Developer
 * @version 10.0
 */
public class TrainConsistManagementApp {

    // Reusing Bogie model from previous Use Cases
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("==========================================\n");

        // 1. Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // 2. Display bogies in Train
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // 3. AGGREGATE USING REDUCE
        // map() extracts capacity field from Bogie object
        // reduce(0, Integer::sum) aggregates values into a total
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 4. Display result
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}