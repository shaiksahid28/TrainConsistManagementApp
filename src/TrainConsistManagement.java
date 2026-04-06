/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagement
 * ==========================================================
 * Use Case 19: Binary Search for Bogie ID
 * * Description:
 * This class demonstrates searching for a specific bogie ID
 * efficiently using the Binary Search algorithm on sorted data.
 * * At this stage, the application:
 * - Requires a sorted array of bogie IDs
 * - Initializes low and high indexes
 * - Calculates mid-point and halves search range
 * - Uses String compareTo() for logic checks
 * * This maps optimized searching using divide-and-conquer.
 * * @author Developer
 * @version 19.0
 */
public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("-------------------------------------------\n");

        // PRECONDITION: Array must be sorted for Binary Search to work
        String[] sortedBogieIds = {"B6101", "B6205", "B6309", "B6412", "B6550"};

        // Bogie ID to search
        String searchId = "B6412";

        System.out.println("Searching for Bogie ID: " + searchId);
        System.out.println("Sorted Bogie IDs in Train:");
        for (String id : sortedBogieIds) {
            System.out.print(id + " ");
        }
        System.out.println("\n");

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = sortedBogieIds.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid index

            // Compare searchId with the element at mid
            int result = searchId.compareTo(sortedBogieIds[mid]);

            if (result == 0) {
                // Match found
                foundIndex = mid;
                break;
            } else if (result > 0) {
                // searchId is lexicographically greater, ignore left half
                low = mid + 1;
            } else {
                // searchId is lexicographically smaller, ignore right half
                high = mid - 1;
            }
        }

        // Display result
        if (foundIndex != -1) {
            System.out.println("Success: Bogie " + searchId + " found at position " + (foundIndex + 1));
        } else {
            System.out.println("Result: Bogie " + searchId + " NOT found in the consist.");
        }

        System.out.println("\nUC19 binary search completed...");
    }
}