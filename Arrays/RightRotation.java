import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements to insert: ");
        int element = scanner.nextInt();

        int[] arr = new int[element];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scanner.nextInt();
        }
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        for (int x : arr) {
            System.out.print(x + ",");
        }
        scanner.close();
    }

}
