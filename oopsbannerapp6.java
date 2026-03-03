// UC6 - OOPS Banner App using Static Helper Methods

public class oopsbannerapp6 {

    // Static method to generate letter O
    public static String[] generateO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method to generate letter P
    public static String[] generateP() {
        return new String[] {
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        };
    }

    // Static method to generate letter S
    public static String[] generateS() {
        return new String[] {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        // Calling static helper methods
        String[] letterO1 = generateO();
        String[] letterO2 = generateO(); // DRY principle reuse
        String[] letterP  = generateP();
        String[] letterS  = generateS();

        int height = letterO1.length;

        // Loop to print banner row by row
        for (int i = 0; i < height; i++) {
            System.out.println(letterO1[i] + "  "
                             + letterO2[i] + "  "
                             + letterP[i]  + "  "
                             + letterS[i]);
        }
    }
}