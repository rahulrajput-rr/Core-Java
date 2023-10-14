import java.util.Arrays;
import java.util.Scanner;

public class Deletion {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter number want to delete: ");
        int x_values = scanner.nextInt();

        System.out.print("At what index:");
        int idx = scanner.nextInt();

        for (int i = arr.length - 1; i > idx; i--) {
            arr[i - 1] = arr[i];
        }

        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
}
