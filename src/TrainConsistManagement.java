import java.util.Arrays;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagement
 * ==========================================================
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 * * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 * * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for optimized sorting
 * - Displays sorted results using Arrays.toString()
 * * This maps optimized sorting using Java library utilities.
 * * @author Developer
 * @version 17.0
 */
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("===============================================\n");

        // Create an array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Display original order
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
        System.out.println();

        // ---- OPTIMIZED SORTING ----
        // Using Java's built-in utility for O(n log n) efficiency
        Arrays.sort(bogieNames);

        // Display sorted result (Alphabetical order)
        System.out.println("Sorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));
        System.out.println();

        System.out.println("UC17 sorting completed...");
    }
}