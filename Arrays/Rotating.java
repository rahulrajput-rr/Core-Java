import java.util.Scanner;

public class Rotating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements to insert: ");
        int element = scanner.nextInt();

        int[] arr = new int[element];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scanner.nextInt();
        }

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        for (int x : arr) {
            System.out.print(x + ",");
        }
        scanner.close();
    }
}
