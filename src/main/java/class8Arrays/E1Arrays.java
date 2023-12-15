package class8Arrays;
public class E1Arrays {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 26, 30, 40, 45, 45};
        for (int i = 0; i < numbers.length; i++) { // instead i<7 = numbers.length
            if(numbers[i]==26){
                System.out.println("Number 26 is present");
                break;
            }
        }
    }
}