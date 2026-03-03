public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] o1 = buildO();
        String[] o2 = buildO();
        String[] p  = buildP();
        String[] s  = buildS();
        String[] banner = new String[o1.length];
        for (int i = 0; i < banner.length; i++) {
            banner[i] = String.join("  ", o1[i], o2[i], p[i], s[i]);
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }

    private static String[] buildO() {
        return new String[] {
            "   *******  ",
            "  **/////** ",
            " **     //**",
            "/**      /**",
            "/**      /**",
            "//**     ** ",
            " //*******  ",
            "  ///////   "
        };
    }

    private static String[] buildP() {
        return new String[] {
            " *******  ",
            "/**//**/**",
            "/**  /**  ",
            "/******** ",
            "/**////   ",
            "/**       ",
            "/**       ",
            "//        "
        };
    }

    private static String[] buildS() {
        return new String[] {
            " ******** ",
            "**//////  ",
            "/**       ",
            "/*********",
            "////////**",
            "       /**",
            " ******** ",
            " ////////  "
        };
    }
}








