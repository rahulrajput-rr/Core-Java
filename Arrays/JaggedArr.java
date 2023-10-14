import java.util.Scanner;

public class JaggedArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many rows do you want to insert: ");
        int rows = scanner.nextInt();

        System.out.print("Enter how many columns do you want to insert: ");
        int columns = scanner.nextInt();
        System.out.print("Enter how many columns do you want to insert: ");
        int columns2 = scanner.nextInt();
        System.out.print("Enter how many columns do you want to insert: ");
        int columns3 = scanner.nextInt();

        int[][] array = new int[rows][];
        array[0] = new int[columns];
        array[1] = new int[columns2];
        array[2] = new int[columns3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        // for (int x[] : array) {
        // for (int y : x) {
        // System.out.print(y + " ");
        // }
        // System.out.println("");
        // }
        scanner.close();
    }

}
