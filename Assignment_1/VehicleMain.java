//Write a Java program that illustrates the concepts of interfaces, method overriding, and
//method overloading. Begin by defining an interface named Vehicle with two abstract methods:
//accelerate() and brake(). Then, create two classes, Car and Bicycle, both of which implement
//the Vehicle interface. In the Car class, override the accelerate() and brake() methods to print
//appropriate messages indicating the acceleration and braking actions for a car. Similarly, in the
//Bicycle class, override the same methods to display messages specific to a bicycle's
//acceleration and braking. Additionally, implement method overloading in both classes by
//providing multiple versions of the accelerate() method, each accepting different parameters
//such as speed and duration. Finally, create a Main class to instantiate objects of both Car and
//        Bicycle classes, test their overridden methods, and demonstrate method overloading by
//        invoking different versions of the accelerate() method.
package sem_4_Assignments.assignment_1;

public class VehicleMain {
    public static void main(String[] args) {
        cars c = new cars();
        Bicycle b = new Bicycle();
        c.accelerate();
        c.brake();
        b.accelerate();
        b.brake();
        c.accelerate(30);
        c.accelerate(40,50);
        b.accelerate(30);
        b.accelerate(30,60);
    }
}
interface  Vehicle{
    void accelerate();
    void brake();
}
class cars implements Vehicle{

    @Override
    public void accelerate() {

        System.out.println("car is accelerating");
    }

    @Override
    public void brake() {

        System.out.println("car applied break");
    }
    public void accelerate(double speed){

        System.out.println("Car is accelerating at speed: " + speed + " km/h");
    }
    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for duration: " + duration + " seconds");
    }
}
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Method overloading
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for duration: " + duration + " seconds");
    }
}