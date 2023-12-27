package class18;

public class CarTester {

    public static void main(String[] args) {
        Car c=new Car("Toyota", "Venza", 2014);
        c.printInfo();
        c.rentalPrice(60, 5);
        System.out.println();
        LuxuryCar lc=new LuxuryCar("Tesla", "XX",2023);
        lc.printInfo();
        lc.rentalPrice(90, 5, 150);
        System.out.println();
        EconomyCar ec=new EconomyCar("Honda", "Civic", 2012);
        ec.printInfo();
        ec.rentalPrice(30, 5);

    }
}
