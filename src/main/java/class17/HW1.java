package class17;

public class HW1 {
    // Create a method to find the minimum of two numbers.
    // Method will be passed two parameters and will return the minimum number.
    // Method should work with int and double data types.
    //Examples
    //min(10,5)=>5
    //min(2.5,3.5)=>2.5

    public int minNum(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public double minNum(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        HW1 minNumber = new HW1();
        System.out.println(minNumber.minNum(3, 7));
        System.out.println(minNumber.minNum(5.5, 9.5));

    }
}
