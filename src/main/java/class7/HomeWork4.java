package class7;
public class HomeWork4 {
    // Create an array of animals and store 5 elements into it.
    // Using 2 different loops print all elements from the array.

    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "lion", "giraffe", "hedgehog"};
        for (int i = 0; i < animals.length; i++)
            System.out.print(animals[i]+" ");

            System.out.println();

            int i = 0;
            while (i<animals.length) {
                System.out.print(animals[i]+" ");
                i++;
        }
    }
}
