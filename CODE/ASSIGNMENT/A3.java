package ASSIGNMENT;

public class A3 {
    public static void main(String[] args) {
        long factorial = 1;
        for (int i = 1; i <= 100; i++) {
            factorial *= i;

            // Print the factorial of the current number
            System.out.println("Factorial of " + i + " = " + factorial);

            // Check if the factorial exceeds 362880
            if (factorial > 362880) {
                System.out.println("Stopping computation as factorial exceeds 362880.");
                break;
            }
        }
    }
}
