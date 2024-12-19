package ASSIGNMENT;
public class A1 {
    public static void main(String[] args) {
        // Initialize the power to 1 (3^0)
        int power = 1;
        // Loop from 0 to 9
        for (int i = 0; i <= 9; i++) {
            // Print the result
            System.out.println("3^" + i + " = " + power);
            // Update the power for the next iteration
            power *= 3;
        }
    }
}


