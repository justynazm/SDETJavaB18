package class22;

import java.util.ArrayList;

// Create an arraylist of cars and retrieve all the values using 2 different ways.
public class Hw1 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Subaru");
        cars.add("Porsche");
        cars.add("Acura");

        for (int i = 0; i < cars.size(); i++) {
            cars.get(i);
        }
        System.out.println(cars);

        System.out.println("----2nd way----");

        for (String c : cars) {
            System.out.println(c);
        }
    }
}
