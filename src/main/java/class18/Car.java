package class18;
/* Car Rental System:

1)Create a class Car with properties like make, model, and year.
Implement a method calculate_rental_price based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to include additional charges.
Demonstrate the functionality by creating instances of each class and calling their methods
*/
public class Car {
    private String make;
    private String model;
    private int year;

    public Car (String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public void printInfo() {System.out.println("The car is: "+make+" "+model+" "+year);}
    public void rentalPrice (int dayPrice, int days){
    int vehiclePrice=dayPrice*days;
        System.out.println("Price for "+days+" days for the car is $"+ vehiclePrice);
    }
    }
class LuxuryCar extends Car{

    public LuxuryCar(String make, String model, int year) { super(make, model, year);}

    public void rentalPrice(int dayPrice, int days, int addCharges){
        int vehiclePrice=dayPrice*days+addCharges;
        System.out.println("Price for " +days+" days for the luxury car is $" +vehiclePrice+ " including additional charges");
    }
}
class EconomyCar extends Car{

    public EconomyCar(String make, String model, int year) {super(make, model, year);}
}
