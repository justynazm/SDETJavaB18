package class9;
public class T5Arrays2d {
    //Using 2D array create a grocery list. Inside you should have an array of veggies, fruits, dairy
    // and sweets Retrieve all values from that array using 2 different loops.

    public static void main(String[] args) {

        String[][] food = {
                {"asparagus", "carrot", "beans", "lettuce"},
                {"apple", "avocado", "watermelon", "peach"},
                {"milk", "cheese", "kefir", "yogurt"},
                {"chocolate", "pralines", "candy", "proteinbar"}
        };

        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i].length; j++) {
                System.out.print(food[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (String[] arr : food) {
            for (String foods : arr) {
                System.out.print(foods+" ");
            }

            System.out.println();
        }

    }
}