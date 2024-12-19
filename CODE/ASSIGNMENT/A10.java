package ASSIGNMENT;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the largest number using a nested ternary operator
        int largest = (num1 > num2) 
                        ? (num1 > num3 ? num1 : num3) 
                        : (num2 > num3 ? num2 : num3);

        // Print the result
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
