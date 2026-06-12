import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("Input: " + input);
        System.out.println("First unique character index: " + firstUniqueCharIndex(input));
    }

    private static int firstUniqueCharIndex(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
