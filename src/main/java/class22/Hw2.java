package class22;
// Create an arrayList of even numbers from 1 to 500 using a loop. Then write another loop to remove any number
// that is divisible by 5 from that arrayList.

import java.util.ArrayList;

public class Hw2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <= 500; i += 2) {
            numbers.add(i);
        }

        // Removing numbers divisible by 5
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 5 == 0) {
                numbers.remove(i);
            }
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}



