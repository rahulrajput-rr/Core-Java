import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements do you want to insert: ");
        int element = scanner.nextInt();

        int array[] = new int[element];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element: " + (i + 1) + ":  ");
            array[i] = scanner.nextInt();
        }

        int[] array2 = new int[10];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            array2[j] = array[i];
        }
        System.out.println(Arrays.toString(array2));
        scanner.close();
    }
}
