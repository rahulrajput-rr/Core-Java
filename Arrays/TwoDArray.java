import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many rows do you want to insert: ");
        int rows = scanner.nextInt();
        System.out.print("Enter how many columns do you want to insert: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element: " + (i) + ":  ");
                array[i][j] = scanner.nextInt();
            }
        }

        /*
         * for (int i = 0; i < array.length; i++) {
         * for (int j = 0; j < array[0].length; j++) {
         * System.out.print(array[i][j] + " ");
         * }
         * System.out.println(" ");
         * }
         */

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int x[] : array) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

        scanner.close();
    }

}
