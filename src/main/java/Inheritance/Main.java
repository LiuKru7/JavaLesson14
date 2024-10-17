package Inheritance;

public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.speed = 60;

        Car car = new Car();
        car.brand = "Audi";
        car.speed = 60;


        car.move();
        car.stop();
        boat.move();
        boat.stop();
    }
}
