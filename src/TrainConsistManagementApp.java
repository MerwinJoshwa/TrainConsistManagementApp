import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method to perform Linear Search
    public static boolean linearSearch(String[] bogieIds, String searchKey) {
        for (int i = 0; i < bogieIds.length; i++) {
            // Using equals() for string comparison
            if (bogieIds[i].equals(searchKey)) {
                return true; // Early termination when found
            }
        }
        return false; // Not found after full traversal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of bogies
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        // Input: Bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        // Input: Search key
        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Output result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND in the train consist.");
        }

        scanner.close();
    }
}