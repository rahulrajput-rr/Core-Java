import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements to insert: ");
        int element = scanner.nextInt();

        int[] arr = new int[element];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scanner.nextInt();
        }

        int max1, max2;
        max1 = max2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];

            } else if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
        scanner.close();
    }

}
