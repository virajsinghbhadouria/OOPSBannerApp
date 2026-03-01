/**
 * OOPSBannerApp UC6 – Refactor Banner Logic into Functions
 *
 * This version replaces hardcoded strings with dedicated helper methods 
 * to generate character patterns, improving modularity and reuse.
 *
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp6 {
    public static void main(String[] args) {
        String s = "   "; // Separator space
        
        // Populate banner lines by invoking character helper methods
        String[] lines = {
            String.join(s, getO()[0], getO()[0], getP()[0], getS()[0]),
            String.join(s, getO()[1], getO()[1], getP()[1], getS()[1]),
            String.join(s, getO()[1], getO()[1], getP()[1], getS()[1]),
            String.join(s, getO()[1], getO()[1], getP()[0], getS()[2]),
            String.join(s, getO()[1], getO()[1], getP()[2], getS()[3]),
            String.join(s, getO()[1], getO()[1], getP()[2], getS()[3]),
            String.join(s, getO()[0], getO()[0], getP()[2], getS()[4])
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Helper method for 'O' pattern
    private static String[] getO() {
        return new String[]{" *** ", "** **"};
    }

    // Helper method for 'P' pattern
    private static String[] getP() {
        return new String[]{"***** ", "** **", "** "};
    }

    // Helper method for 'S' pattern
    private static String[] getS() {
        return new String[]{" **** ", "** ", " *** ", "    **", " **** "};
    }
}