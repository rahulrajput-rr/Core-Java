import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements do you want to insert: ");
        int element = scanner.nextInt();

        int arr[] = new int[element];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: " + (i + 1) + ":  ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        scanner.close();

    }

}
