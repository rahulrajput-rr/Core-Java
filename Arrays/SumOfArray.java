import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements do you want to insert: ");
        int element = scanner.nextInt();

        int array[] = new int[element];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element: " + (i + 1) + ":  ");
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        System.out.println("Total sum of an array " + sum);
        scanner.close();

    }

}
