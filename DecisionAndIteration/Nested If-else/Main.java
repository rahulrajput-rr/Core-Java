// package Nested If-else;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.err.println("Number is Zero");
        } else {
            if (number < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is positive");
            }
        }

        scanner.close();
    }

}
