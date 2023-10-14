import java.util.Scanner;

public class SearchingEle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements to insert: ");
        int element = scanner.nextInt();

        int[] arr = new int[element];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the Key want to search from an array:  ");
        int key = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Found key: " + arr[i] + " at index " + i);
                System.exit(0);
            }
        }

        System.out.println("Not found");

        scanner.close();
    }
}
