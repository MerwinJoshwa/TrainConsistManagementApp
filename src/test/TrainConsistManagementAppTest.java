public class TrainConsistManagementAppTest {

    public static void main(String[] args) {

        testSearch_BogieFound();
        testSearch_BogieNotFound();
        testSearch_FirstElementMatch();
        testSearch_LastElementMatch();
        testSearch_SingleElementArray();

    }

    // Test: Bogie Found
    public static void testSearch_BogieFound() {
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        boolean result = TrainConsistManagementApp.linearSearch(bogies, "BG309");

        System.out.println("testSearch_BogieFound: " + (result ? "PASS" : "FAIL"));
    }

    // Test: Bogie Not Found
    public static void testSearch_BogieNotFound() {
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        boolean result = TrainConsistManagementApp.linearSearch(bogies, "BG999");

        System.out.println("testSearch_BogieNotFound: " + (!result ? "PASS" : "FAIL"));
    }

    // Test: First Element Match
    public static void testSearch_FirstElementMatch() {
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        boolean result = TrainConsistManagementApp.linearSearch(bogies, "BG101");

        System.out.println("testSearch_FirstElementMatch: " + (result ? "PASS" : "FAIL"));
    }

    // Test: Last Element Match
    public static void testSearch_LastElementMatch() {
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        boolean result = TrainConsistManagementApp.linearSearch(bogies, "BG550");

        System.out.println("testSearch_LastElementMatch: " + (result ? "PASS" : "FAIL"));
    }

    // Test: Single Element Array
    public static void testSearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        boolean result = TrainConsistManagementApp.linearSearch(bogies, "BG101");

        System.out.println("testSearch_SingleElementArray: " + (result ? "PASS" : "FAIL"));
    }
}