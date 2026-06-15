public class ReverseWordsInArray {
    public static void main(String[] args) {
        char[] arr = "hello world".toCharArray();
        reverseWords(arr);
        System.out.println("Reversed words: " + new String(arr));
    }

    private static void reverseWords(char[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        reverse(arr, 0, arr.length - 1);
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
