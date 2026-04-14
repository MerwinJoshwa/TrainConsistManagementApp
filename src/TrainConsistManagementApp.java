import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static boolean binarySearch(String[] bogieIds, String searchKey) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        try {
            boolean found = binarySearch(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}