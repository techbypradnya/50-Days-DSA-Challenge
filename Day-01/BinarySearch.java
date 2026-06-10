import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int position = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                position = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (position != -1) {
            System.out.println("Element found at index " + position);
            System.out.println("Position = " + (position + 1));
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}