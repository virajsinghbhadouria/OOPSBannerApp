import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Map Collection & Render Function
 *
 * Utilizes a HashMap to store and lookup character patterns efficiently, 
 * allowing the application to render banners dynamically via a function.
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp8 {

    public static void main(String[] args) {
        // Initialize the character pattern library
        Map<Character, String[]> patternMap = new HashMap<>();
        
        patternMap.put('O', new String[]{" *** ", "** **", "** **", "** **", "** **", "** **", " *** "});
        patternMap.put('P', new String[]{"***** ", "** **", "** **", "***** ", "** ", "** ", "** "});
        patternMap.put('S', new String[]{" **** ", "** ", "** ", " *** ", "    **", "    **", " **** "});

        render("OOPS", patternMap);
    }

    /**
     * Renders a given word as a banner using the provided pattern map.
     */
    private static void render(String word, Map<Character, String[]> map) {
        String s = "   "; // Separator
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (map.containsKey(c)) {
                    line.append(map.get(c)[row]).append(s);
                }
            }
            System.out.println(line.toString());
        }
    }
}