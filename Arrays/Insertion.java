import java.util.Scanner;
import java.util.Arrays;

public class Insertion {
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
        System.out.print("\nEnter number want to insert: ");
        int x_values = scanner.nextInt();

        System.out.print("At what index:");
        int idx = scanner.nextInt();

        for (int i = arr.length - 1; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = x_values;
        // for (int x : arr) {
        // System.out.print(x + ",");
        // }
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }

}
