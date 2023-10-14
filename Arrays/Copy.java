import java.util.Arrays;
import java.util.Scanner;

public class Copy {
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

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array2));

        scanner.close();
    }
}