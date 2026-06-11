public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.print("Array after moving zeros to end: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static void moveZerosToEnd(int[] arr) {
        int lastNonZero = 0;
        for (int current = 0; current < arr.length; current++) {
            if (arr[current] != 0) {
                arr[lastNonZero++] = arr[current];
            }
        }
        while (lastNonZero < arr.length) {
            arr[lastNonZero++] = 0;
        }
    }
}
