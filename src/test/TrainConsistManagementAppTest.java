public class TrainConsistManagementAppTest {

    public static void main(String[] args) {

        testSearch_ThrowsExceptionWhenEmpty();
        testSearch_AllowsSearchWhenDataExists();
        testSearch_BogieFoundAfterValidation();
        testSearch_BogieNotFoundAfterValidation();
        testSearch_SingleElementValidCase();

    }

    public static void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};
        try {
            TrainConsistManagementApp.binarySearch(bogies, "BG101");
            System.out.println("testSearch_ThrowsExceptionWhenEmpty: FAIL");
        } catch (IllegalStateException e) {
            System.out.println("testSearch_ThrowsExceptionWhenEmpty: PASS");
        }
    }

    public static void testSearch_AllowsSearchWhenDataExists() {
        String[] bogies = {"BG101","BG205"};
        try {
            TrainConsistManagementApp.binarySearch(bogies, "BG101");
            System.out.println("testSearch_AllowsSearchWhenDataExists: PASS");
        } catch (Exception e) {
            System.out.println("testSearch_AllowsSearchWhenDataExists: FAIL");
        }
    }

    public static void testSearch_BogieFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};
        boolean result = TrainConsistManagementApp.binarySearch(bogies, "BG205");
        System.out.println("testSearch_BogieFoundAfterValidation: " + (result ? "PASS" : "FAIL"));
    }

    public static void testSearch_BogieNotFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};
        boolean result = TrainConsistManagementApp.binarySearch(bogies, "BG999");
        System.out.println("testSearch_BogieNotFoundAfterValidation: " + (!result ? "PASS" : "FAIL"));
    }

    public static void testSearch_SingleElementValidCase() {
        String[] bogies = {"BG101"};
        boolean result = TrainConsistManagementApp.binarySearch(bogies, "BG101");
        System.out.println("testSearch_SingleElementValidCase: " + (result ? "PASS" : "FAIL"));
    }
}