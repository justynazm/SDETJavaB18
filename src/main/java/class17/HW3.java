package class17;

public class HW3 {
    // Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    public static void overLo(String name) {
        System.out.println("Message: " + name);
    }

    public static void overLo(int number) {
        System.out.println("Number: " + number);
    }

    public static void overLo(double value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        overLo("Hello Batch 18");
        overLo(1);
        overLo(100.00);
    }

}
