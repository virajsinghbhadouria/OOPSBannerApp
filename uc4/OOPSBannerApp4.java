/**
 * OOPSBannerApp UC4 – Render OOPS as Banner (Array & Loop)
 *
 * Centralizes banner lines in an array and uses a for-each loop for display.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp4 {
    public static void main(String[] args) {
        String s = "   ";
        String[] lines = new String[7];

        lines[0] = String.join(s, " *** ", " *** ", "***** ", " **** ");
        lines[1] = String.join(s, "** **", "** **", "** **", "** ");
        lines[2] = String.join(s, "** **", "** **", "** **", "** ");
        lines[3] = String.join(s, "** **", "** **", "***** ", " *** ");
        lines[4] = String.join(s, "** **", "** **", "** ", "    **");
        lines[5] = String.join(s, "** **", "** **", "** ", "    **");
        lines[6] = String.join(s, " *** ", " *** ", "** ", " **** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}