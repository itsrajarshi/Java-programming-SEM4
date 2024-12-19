package ASSIGNMENT2;

public class SwapDemo {
    public static void main(String[] args) {
        Number num = new Number(10, 20);
        System.out.println("Before swap: a = " + num.a + ", b = " + num.b);

        num.swap(num);
        System.out.println("After swap: a = " + num.a + ", b = " + num.b);
    }
}
