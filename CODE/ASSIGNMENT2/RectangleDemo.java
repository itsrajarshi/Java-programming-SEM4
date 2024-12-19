package ASSIGNMENT2;

// Q3: Rectangle class
class Rectangle {
    int length;
    int width;

    // Constructor to initialize attributes
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    int calculateArea() {
        return length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("The area of the rectangle is: " + rect.calculateArea());
    }
}
