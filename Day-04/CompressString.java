public class CompressString {
    public static void main(String[] args) {
        String input = "aaabcccccc";
        System.out.println("Input: " + input);
        System.out.println("Compressed: " + compressString(input));
    }

    private static String compressString(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder compressed = new StringBuilder();
        char current = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                count++;
            } else {
                compressed.append(current).append(count);
                current = s.charAt(i);
                count = 1;
            }
        }
        compressed.append(current).append(count);

        return compressed.toString();
    }
}
