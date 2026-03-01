/**
 * OOPSBannerApp UC3 – Render OOPS as Banner (String.join)
 *
 * This class utilizes String.join() for more efficient string creation, 
 * reducing memory footprint and improving performance.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp3 {
    public static void main(String[] args) {
        System.out.println(String.join("   ", " *** ", " *** ", "***** ", " **** "));
        System.out.println(String.join("   ", "** **", "** **", "** **", "** "));
        System.out.println(String.join("   ", "** **", "** **", "** **", "** "));
        System.out.println(String.join("   ", "** **", "** **", "***** ", " *** "));
        System.out.println(String.join("   ", "** **", "** **", "** ", "    **"));
        System.out.println(String.join("   ", "** **", "** **", "** ", "    **"));
        System.out.println(String.join("   ", " *** ", " *** ", "** ", " **** "));
    }
}