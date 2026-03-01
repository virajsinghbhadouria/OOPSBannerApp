/**
 * OOPSBannerApp UC5 – Render OOPS as Banner (Array Initialization)
 *
 * Combines array declaration and initialization with String.join() 
 * to create a more compact and readable implementation.
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp5 {
    public static void main(String[] args) {
        String s = "   "; // Separator space
        
        // Inline initialization of the String array
        String[] lines = {
            String.join(s, " *** ", " *** ", "***** ", " **** "),
            String.join(s, "** **", "** **", "** **", "** "),
            String.join(s, "** **", "** **", "** **", "** "),
            String.join(s, "** **", "** **", "***** ", " *** "),
            String.join(s, "** **", "** **", "** ", "    **"),
            String.join(s, "** **", "** **", "** ", "    **"),
            String.join(s, " *** ", " *** ", "** ", " **** ")
        };

        // Use a for-each loop to print the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}