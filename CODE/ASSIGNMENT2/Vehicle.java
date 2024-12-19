package ASSIGNMENT2;

public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    // Constructor to initialize vehicle object
    Vehicle(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    // Method to compute and return range
    int range() {
        return fuelCap * mpg;
    }
}
