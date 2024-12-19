package ASSIGNMENT2;

public class Main2 {
    static void modifyBox(Box b) {
        b.height += 10;
    }

    public static void main(String[] args) {
        Box box = new Box(20);
        System.out.println("Height before modification: " + box.height);

        modifyBox(box);

        System.out.println("Height after modification: " + box.height);
    }
}
