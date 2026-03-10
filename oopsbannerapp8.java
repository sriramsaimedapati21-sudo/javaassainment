import java.util.HashMap;
import java.util.Map;

public class oopsbannerapp8 {

    // CharacterPattern class to encapsulate character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // CharacterPatternMap using HashMap for fast lookup
    static class CharacterPatternMap {
        private static Map<Character, String[]> characterMap = new HashMap<>();

        // Static block to initialize patterns
        static {
            characterMap.put('O', new String[]{
                    "  OOO  ",
                    " O   O ",
                    " O   O ",
                    " O   O ",
                    "  OOO  "
            });

            characterMap.put('P', new String[]{
                    " PPPP  ",
                    " P   P ",
                    " PPPP  ",
                    " P     ",
                    " P     "
            });

            characterMap.put('S', new String[]{
                    "  SSS  ",
                    " S     ",
                    "  SSS  ",
                    "     S ",
                    "  SSS  "
            });
        }

        // Efficient pattern retrieval
        public static String[] getPattern(char ch) {
            return characterMap.getOrDefault(Character.toUpperCase(ch), new String[]{
                    "       ",
                    "       ",
                    "       ",
                    "       ",
                    "       "
            });
        }
    }

    // Method to print any word as a banner
    public static void printBanner(String word) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                sb.append(CharacterPatternMap.getPattern(ch)[i]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {
        String word = "OOPS";
        System.out.println("Banner for: " + word);
        printBanner(word);
    }
}