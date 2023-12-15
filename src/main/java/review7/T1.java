package review7;

public class T1 {
    // Create a method which take an array of inst as input and going to return the sum
    // of all the numbers from the input array
    //
    public static int arr(int[] numbers) {
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum = sum+numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ar = new int[] {10, 20, 56};
        System.out.println("Sum of the array: " + arr(ar));
    }






}
