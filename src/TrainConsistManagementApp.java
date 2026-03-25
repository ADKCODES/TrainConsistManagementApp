import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("==========================================\n");

        List<String> passengerBogies = new ArrayList<>();

        System.out.println("--- Initializing Train ---");
        System.out.println("Initial Bogie Count : " + passengerBogies.size());

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\n--- Managing Bogies (ArrayList) ---");
        System.out.println("After Adding: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair': " + passengerBogies);
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        System.out.println("\n--- Tracking Unique IDs (HashSet) ---");
        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");

        System.out.println("Unique Bogie IDs: " + bogieIds);
        System.out.println("Note: Duplicate 'BG101' was automatically ignored.");

        System.out.println("\nAll operations completed successfully.");
    }
}