package ASSIGNMENT2;

// Q6: Swap two numbers using a helper class
class Number {
    int a;
    int b;

    Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void swap(Number n) {
        int temp = n.a;
        n.a = n.b;
        n.b = temp;
    }
}

