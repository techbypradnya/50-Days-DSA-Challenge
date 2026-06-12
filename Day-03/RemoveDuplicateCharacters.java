import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Input: " + input);
        System.out.println("Output: " + removeDuplicates(input));
    }

    private static String removeDuplicates(String s) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
