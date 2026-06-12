public class ReverseString {
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reverse(input));
    }

    private static String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
