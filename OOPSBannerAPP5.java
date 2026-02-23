public class OOPSBannerAPP5 {

    public static void main(String[] args) {

        // Declare and initialize banner in single statement
        String[] banner = {

            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}