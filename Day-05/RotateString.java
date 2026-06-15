public class RotateString {
    public static void main(String[] args) {
        String input = "hello world";
        int k = 3;
        System.out.println("Input: " + input);
        System.out.println("Rotated: " + rotateString(input, k));
    }

    private static String rotateString(String s, int k) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        int n = s.length();
        k %= n;
        if (k < 0) {
            k += n;
        }
        return s.substring(n - k) + s.substring(0, n - k);
    }
}
