package class21;
/* Vehicle Management System: Design a base class Vehicle with methods like startEngine(), stopEngine(), fuelUp(),
and fields like make, model, and fuelLevel. Create subclasses like Car, Truck, and Motorcycle,
each with specific implementations for the methods, considering their unique characteristics.
 */
public abstract class Vehicle {
    private String make;
    private String model;
    private String fuelLevel;

    public Vehicle(String make, String model, String fuelLevel) {
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }
    public void printInfo(){
        System.out.println("Vehicle make: "+make+" Model: "+model+" Fuel Level: "+fuelLevel);
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    public void fuelUp(){
        System.out.println(make+" is getting filled up");}
    }

class Car extends Vehicle {

    public Car(String make, String model, String fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("Start the car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the Car");
    }
}

class Truck extends Vehicle {

    public Truck(String make, String model, String fuelLevel) {
        super(make, model, fuelLevel);
    }
    @Override
    public void startEngine() {
        System.out.println("Start the Truck!");
    }
    @Override
    public void stopEngine() {
        System.out.println("Stop the Truck!");
    }
    }
    class Motorcycle extends Vehicle {

        public Motorcycle(String make, String model, String fuelLevel) {
            super(make, model, fuelLevel);
        }

        @Override
        public void startEngine() {
            System.out.println("Start the Motorcycle");
        }
    @Override
        public void stopEngine(){
        System.out.println("Stop the Motorcycle");
    }

}
