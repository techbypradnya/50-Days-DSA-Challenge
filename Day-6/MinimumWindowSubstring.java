public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Input: " + s + ", target=" + t);
        System.out.println("Minimum window: " + minWindow(s, t));
    }

    private static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] targetCount = new int[128];
        for (char c : t.toCharArray()) {
            targetCount[c]++;
        }

        int left = 0;
        int minLeft = 0;
        int minLength = Integer.MAX_VALUE;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (targetCount[c] > 0) {
                count++;
            }
            targetCount[c]--;

            while (count == t.length()) {
                if (right - left + 1 < minLength) {
                    minLeft = left;
                    minLength = right - left + 1;
                }
                char leftChar = s.charAt(left);
                targetCount[leftChar]++;
                if (targetCount[leftChar] > 0) {
                    count--;
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
