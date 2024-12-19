package ASSIGNMENT2;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(5, 15, 20);
        System.out.println("The car can carry " + car.passengers + " passengers for a range of " + car.range() + " miles.");
    }
}
