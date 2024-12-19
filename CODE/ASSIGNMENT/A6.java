package ASSIGNMENT;
public class A6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            // Skip even numbers
            if (i % 2 == 0) {
                continue;
            }
            // Print odd numbers
            System.out.println(i);
        }
    }
}

