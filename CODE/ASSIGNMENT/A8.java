package ASSIGNMENT;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a power of 2 using bitwise operators
        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }

        scanner.close();
    }
}

