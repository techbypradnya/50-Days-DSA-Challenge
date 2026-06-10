import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break;
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