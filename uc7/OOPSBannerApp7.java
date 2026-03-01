/**
 * OOPSBannerApp UC7 – Encapsulate Patterns in an Inner Class
 *
 * This version uses a CharacterPattern inner class to encapsulate 
 * character data, providing better reusability and scalability.
 *
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp7 {
    
    // Inner class to encapsulate character data
    private static class CharacterPattern {
        String[] pattern;

        CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {
        String s = "   "; // Separator space
        
        // Create instances for each character
        CharacterPattern charO = new CharacterPattern(new String[]{" *** ", "** **"});
        CharacterPattern charP = new CharacterPattern(new String[]{"***** ", "** **", "** "});
        CharacterPattern charS = new CharacterPattern(new String[]{" **** ", "** ", " *** ", "    **", " **** "});

        // Populate banner lines using stored instances
        String[] lines = {
            String.join(s, charO.pattern[0], charO.pattern[0], charP.pattern[0], charS.pattern[0]),
            String.join(s, charO.pattern[1], charO.pattern[1], charP.pattern[1], charS.pattern[1]),
            String.join(s, charO.pattern[1], charO.pattern[1], charP.pattern[1], charS.pattern[1]),
            String.join(s, charO.pattern[1], charO.pattern[1], charP.pattern[0], charS.pattern[2]),
            String.join(s, charO.pattern[1], charO.pattern[1], charP.pattern[2], charS.pattern[3]),
            String.join(s, charO.pattern[1], charO.pattern[1], charP.pattern[2], charS.pattern[3]),
            String.join(s, charO.pattern[0], charO.pattern[0], charP.pattern[2], charS.pattern[4])
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}