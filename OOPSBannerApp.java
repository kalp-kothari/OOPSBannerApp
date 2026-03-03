public class OOPSBannerApp {
    public static void main(String[] args) {
        String word = "OOPS";
        String[] banner = new String[8];
        for (int i = 0; i < banner.length; i++) {
            banner[i] = "";
        }
        for (char ch : word.toCharArray()) {
            CharacterPatternMap pattern = CharacterPatternMap.getPattern(ch);
            if (pattern != null) {
                String[] rows = pattern.getPattern();
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
        private char character;
        private String[] pattern;

        private CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }

        private static final CharacterPatternMap[] REGISTRY = {
            new CharacterPatternMap('O', new String[]{
                "   *******  ",
                "  **/////** ",
                " **     //**",
                "/**      /**",
                "/**      /**",
                "//**     ** ",
                " //*******  ",
                "  ///////   "
            }),
            new CharacterPatternMap('P', new String[]{
                "   *******",
                " /**////**",
                " /**   /**",
                " /******* ",
                " /**////  ",
                " /**      ",
                " /**      ",
                " //       "
            }),
            new CharacterPatternMap('S', new String[]{
                "   ********",
                " **//////  ",
                " /**       ",
                " /*********",
                " ////////**",
                "        /**",
                " ********  ",
                " ////////  "
            })
        };

        public static CharacterPatternMap getPattern(char ch) {
            for (CharacterPatternMap entry : REGISTRY) {
                if (entry.character == ch) {
                    return entry;
                }
            }
            return null;
        }
    }
}