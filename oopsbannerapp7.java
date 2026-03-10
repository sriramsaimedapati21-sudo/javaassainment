import java.util.HashMap;
import java.util.Map;

public class oopsbannerapp7
 {

    // UC7: CharacterPattern class to store character and its ASCII pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Static inner class to hold all character mappings
    static class CharacterPatternMap {
        private static Map<Character, CharacterPattern> characterMap = new HashMap<>();

        // Static block to initialize patterns
        static {
            characterMap.put('O', new CharacterPattern('O', new String[]{
                    "  OOO  ",
                    " O   O ",
                    " O   O ",
                    " O   O ",
                    "  OOO  "
            }));
            characterMap.put('P', new CharacterPattern('P', new String[]{
                    " PPPP  ",
                    " P   P ",
                    " PPPP  ",
                    " P     ",
                    " P     "
            }));
            characterMap.put('S', new CharacterPattern('S', new String[]{
                    "  SSS  ",
                    " S     ",
                    "  SSS  ",
                    "     S ",
                    "  SSS  "
            }));
        }

        // Method to retrieve pattern by character
        public static String[] getPattern(char ch) {
            CharacterPattern cp = characterMap.get(Character.toUpperCase(ch));
            if (cp != null) {
                return cp.getPattern();
            } else {
                // Return empty pattern for unknown character
                return new String[]{"       ", "       ", "       ", "       ", "       "};
            }
        }
    }

    // Method to print a word using the CharacterPatternMap
    public static void printBanner(String word) {
        int rows = 5; // each character pattern has 5 rows

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                sb.append(CharacterPatternMap.getPattern(ch)[i]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";
        System.out.println("Banner for: " + word);
        printBanner(word);
    }
}