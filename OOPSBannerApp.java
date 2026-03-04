import java.util.HashMap;

public class OOPSBannerApp {
    public static void main(String[] args) {
        String word = "OOPS";
        String[] banner = new String[8];
        for (int i = 0; i < banner.length; i++) {
            banner[i] = "";
        }
        for (char ch : word.toCharArray()) {
            String[] rows = CharacterPatternMap.getPattern(ch);
            if (rows != null) {
                for (int i = 0; i < rows.length; i++) {
                    banner[i] = banner[i] + rows[i] + "   ";
                }
            }
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }
    static class CharacterPatternMap {

        private static final HashMap<Character, String[]> PATTERN_MAP = new HashMap<>();
        static {
            PATTERN_MAP.put('O', new String[]{
                "   *******  ",
                "  **/////** ",
                " **     //**",
                "/**      /**",
                "/**      /**",
                "//**     ** ",
                " //*******  ",
                "  ///////   "
            });
            PATTERN_MAP.put('P', new String[]{
                "   *******",
                " /**////**",
                " /**   /**",
                " /******* ",
                " /**////  ",
                " /**      ",
                " /**      ",
                " //       "
            });
            PATTERN_MAP.put('S', new String[]{
                "   ********",
                " **//////  ",
                " /**       ",
                " /*********",
                " ////////**",
                "        /**",
                " ********  ",
                " ////////  "
            });
        }
        public static String[] getPattern(char ch) {
            return PATTERN_MAP.get(ch);
        }
    }
}