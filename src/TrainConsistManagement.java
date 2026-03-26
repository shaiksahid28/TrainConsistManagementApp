import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("========================================\n");

        // Sample inputs (you can change for testing)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // --- DEFINE REGEX PATTERNS ---
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainIdPattern = Pattern.compile(trainPattern);
        Pattern cargoCodePattern = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);

        // --- VALIDATE ---
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid: " + trainId);
        } else {
            System.out.println("Invalid Train ID: " + trainId);
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }

        System.out.println("\nUC11 validation completed...");
    }
}