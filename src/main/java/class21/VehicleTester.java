package class21;

public class VehicleTester {

    public static void main(String[] args) {

        Vehicle[] arr={
                new Car("Toyota", "Highlander", "low"),
                new Truck("Volvo", "VNL 670", "full"),
                new Motorcycle("Suzuki", "GSX-R", "medium")
        };
        for(Vehicle v:arr){
            v.startEngine();
            v.stopEngine();
            v.fuelUp();
            System.out.println(".....................");
        }
    }
}
