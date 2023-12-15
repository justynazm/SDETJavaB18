package class7;
public class HomeWork3 {
    //Create an array of cars and store 6 elements into it.
    // Using 2 different loops print all values from the array.

    public static void main(String[] args) {
        // 1
        String[] cars = {"Toyota", "Subaru", "Acura", "Mercedes", "Porsche", "Audi"};
        for (int i = 0; i < cars.length; i++)
            System.out.print(cars[i]+" ");

        System.out.println();
        // 2

            int i = 0;
            while (i < cars.length) {
                System.out.print(cars[i]+" ");
                i++;
            }


        }
    }



