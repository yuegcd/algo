package verbalArthmetci;

public class InterviewCrypto {

    /**
     * Example 1
     * crypt = ["SEND", "MORE", "MONEY"]
     * solution = [['O', '0'],
     *             ['M', '1'],
     *             ['Y', '2'],
     *             ['E', '5'],
     *             ['N', '6'],
     *             ['D', '7'],
     *             ['R', '8'],
     *             ['S', '9']]
     *
     * solution(crypt, solution) = true
     *
     * Exemple 2
     *
     * crypt = ["TEN", "TWO", "ONE"]
     * solution = [['O', '1'],
     *             ['T', '0'],
     *             ['W', '9'],
     *             ['E', '5'],
     *             ['N', '4']]
     *
     * solution(crypt, solution) = false
     *
     * 054 + 091 = 145 (contiennent tous deux des zéros initiaux)
     */

    public static String[] CRYPT = {"SEND","MORE","MONEY"};
    public static char[][] SOLUTION_CRYPT = {
            {'O', '0'},
            {'M', '1'},
            {'Y', '2'},
            {'E', '5'},
            {'N', '6'},
            {'D', '7'},
            {'R', '8'},
            {'S', '9'}};

    public static void main(String[] args) {
        System.out.println("Verify solution: " + solution(CRYPT, SOLUTION_CRYPT));
        verifyCode();
    }

    public static boolean solution(String[] crypt, char[][] solution) {
        /* Développez la solution ici */
        return false;
    }

    /** Don't touch */

    public static String[] CRYPT_1 = {"SEND","MORE","MONEY"};
    public static char[][] SOLUTION_CRYPT_1 = {
            {'O', '0'},
            {'M', '1'},
            {'Y', '2'},
            {'E', '5'},
            {'N', '6'},
            {'D', '7'},
            {'R', '8'},
            {'S', '9'}};

    public static String[] CRYPT_2 = {"TEN","TWO","ONE"};
    public static char[][] SOLUTION_CRYPT_2 = {
            {'O', '1'},
            {'T', '0'},
            {'W', '9'},
            {'E', '5'},
            {'N', '4'}};

    public static String[] CRYPT_3 = {"ONE","ONE","TWO"};
    public static char[][] SOLUTION_CRYPT_3 = {
            {'O', '2'},
            {'T', '4'},
            {'W', '6'},
            {'E', '1'},
            {'N', '3'}};


    public static String[] CRYPT_4 = {"ONE","ONE","TWO"};
    public static char[][] SOLUTION_CRYPT_4 = {
            {'O','0'},
            {'T','1'},
            {'W','2'},
            {'E','5'},
            {'N','6'}};

    public static String[] CRYPT_5 = {"A","A","A"};
    public static char[][] SOLUTION_CRYPT_5 = {
            {'A', '0'}};


    public static String[] CRYPT_6 = {"A","B","C"};
    public static char[][] SOLUTION_CRYPT_6 = {
            {'A', '5'},
            {'B', '6'},
            {'C', '1'}};

    public static String[] CRYPT_7 = {"AA","AA","AA"};
    public static char[][] SOLUTION_CRYPT_7 = {
            {'A', '0'}};

    public static String[] CRYPT_8 = {"A","A","A"};
    public static char[][] SOLUTION_CRYPT_8 = {
            {'A', '1'}};

    public static String[] CRYPT_9 = {"AA","AA","BB"};
    public static char[][] SOLUTION_CRYPT_9 = {
            {'A', '1'},
            {'B', '2'}};

    public static String[] CRYPT_10 = {"BAA","CAB","DAB"};
    public static char[][] SOLUTION_CRYPT_10 = {
            {'A', '0'},
            {'B', '1'},
            {'C', '2'},
            {'D', '4'}};

    public static void verifyCode() {
        System.out.println("\n");

        System.out.println("Test 1: " + ((solution(CRYPT_1, SOLUTION_CRYPT_1) == true) ? "pass" : "failed"));
        System.out.println("Test 2: " + ((solution(CRYPT_2, SOLUTION_CRYPT_2) == false) ? "pass" : "failed"));
        System.out.println("Test 3: " + ((solution(CRYPT_3, SOLUTION_CRYPT_3) == true) ? "pass" : "failed"));
        System.out.println("Test 4: " + ((solution(CRYPT_4, SOLUTION_CRYPT_4) == false) ? "pass" : "failed"));
        System.out.println("Test 5: " + ((solution(CRYPT_5, SOLUTION_CRYPT_5) == true) ? "pass" : "failed"));
        System.out.println("Test 6: " + ((solution(CRYPT_6, SOLUTION_CRYPT_6) == false) ? "pass" : "failed"));
        System.out.println("Test 7: " + ((solution(CRYPT_7, SOLUTION_CRYPT_7) == false) ? "pass" : "failed"));
        System.out.println("Test 8: " + ((solution(CRYPT_8, SOLUTION_CRYPT_8) == false) ? "pass" : "failed"));
        System.out.println("Test 9: " + ((solution(CRYPT_9, SOLUTION_CRYPT_9) == true) ? "pass" : "failed"));
        System.out.println("Test 10: " + ((solution(CRYPT_10, SOLUTION_CRYPT_10) == false) ? "pass" : "failed"));
    }
}
