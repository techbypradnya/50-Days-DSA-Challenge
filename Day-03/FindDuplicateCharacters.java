import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Input: " + input);
        System.out.println("Duplicate characters: " + findDuplicates(input));
    }

    private static String findDuplicates(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        StringBuilder duplicates = new StringBuilder();

        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.append(entry.getKey()).append(' ');
            }
        }

        return duplicates.toString().trim();
    }
}
