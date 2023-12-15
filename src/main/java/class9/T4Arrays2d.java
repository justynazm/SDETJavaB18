package class9;
public class T4Arrays2d {
    // Create 2D array of cars: american, german, korean, italian. Then retrieve all values
    // from that array using 2 different loops

    public static void main(String[] args) {
        String[][] cars = {
                {"Chevrolet", "Jeep", "Ford"},
                {"Mercedes", "Porsche", "Volkswagen"},
                {"Kia", "Hyundai", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Using Enhanced for loop");
        System.out.println();
        for (String[] arr : cars) {
            for (String car : arr) {
                System.out.print(car + " ");
            }

            System.out.println();
        }

    }
}
