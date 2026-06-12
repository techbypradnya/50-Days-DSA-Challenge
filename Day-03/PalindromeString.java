public class PalindromeString {
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println("Input: " + input);
        System.out.println("Is palindrome? " + isPalindrome(input));
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
