import java.util.HashMap;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Input: \"" + s1 + "\" and \"" + s2 + "\"");
        System.out.println("Are anagrams: " + isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!count.containsKey(c)) {
                return false;
            }
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) {
                count.remove(c);
            }
        }

        return count.isEmpty();
    }
}
