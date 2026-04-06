public class TrainConsistManagement {

    public static void performSearch(String[] bogieIds, String searchId) {
        System.out.println("Initiating search for Bogie: " + searchId);

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Search Failed: No bogies available in the train consist.");
        }

        boolean found = false;
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie " + searchId + " found successfully.");
        } else {
            System.out.println("Bogie " + searchId + " not found.");
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("-------------------------------------------\n");

        String[] emptyConsist = {};

        try {
            System.out.println("Scenario: Searching an empty train...");
            performSearch(emptyConsist, "B6101");
        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\n-------------------------------------------");

        String[] validConsist = {"B6101", "B6205", "B6309"};

        try {
            System.out.println("Scenario: Searching a valid train...");
            performSearch(validConsist, "B6205");
        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\nUC20 defensive check completed...");
    }
}