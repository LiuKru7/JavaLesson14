package Inheritance;

public class Car extends Vehicle{
    String brand;

    public void move () {
        System.out.println("Car "+ brand +  " is moving at speed: " + speed + " km/h.");
    }
}

