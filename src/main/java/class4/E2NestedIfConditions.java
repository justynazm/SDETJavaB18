package class4;

public class E2NestedIfConditions {

    public static void main(String[] args) {

        double budget = 50000;
        String engineType = "Petrol";
        if (budget >= 50000) { // 50000>50000 - False 50000=50000 - True

            if (engineType.equals("Electric")) {
                System.out.println("I want to Buy a tesla"); // False
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Toyota");
            } else {
                System.out.println("I want to Buy a Porsche");
            }

        } else if (budget >= 30000) {// 35>30 - True 35=30 - False

            if (engineType.equals("Electric")) { // False
                System.out.println("i want to Buy BYD");
            } else if (engineType.equals("Hybrid")) { // True
                System.out.println("i want to buy Camry");
            } else {
                System.out.println("hyundai Sonata"); // False
            }

        } else if (budget >= 20000) {

            if (engineType.equals("Electric")) {
                System.out.println("nissan leaf");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("Kia");
            } else {
                System.out.println("Honda Civic");
            }
        } else {
            System.out.println("Let's save more");
        }
    }
}

