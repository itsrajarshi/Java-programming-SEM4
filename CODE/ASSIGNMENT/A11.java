package ASSIGNMENT;

public class A11 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 2 and 100:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number other than 1 and itself
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If num is prime, print it
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
