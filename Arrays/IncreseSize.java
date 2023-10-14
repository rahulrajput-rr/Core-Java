import java.util.Arrays;
import java.util.Scanner;

public class IncreseSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements do you want to insert: ");
        int element = scanner.nextInt();

        int array[] = new int[element];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element: " + (i + 1) + ":  ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Length of array : " + array.length);

        int[] array2 = new int[2 * array.length]; // double the size of the array

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;

        System.out.println(Arrays.toString(array) + "\nLength  of array " + array.length);

        scanner.close();
    }

}
