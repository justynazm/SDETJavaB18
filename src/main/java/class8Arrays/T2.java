package class8Arrays;
public class T2 {
    // show the sum of even numbers and odd numbers separetly

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};

        int sumOdd = 0;
        int sumEven = 0;
        for (int num : numbers) {

            if (num % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }
        }
        System.out.println("Sum of Even Numbers is " +sumEven);
        System.out.println("Sum of Odd Numbers is " +sumOdd);

    }
}