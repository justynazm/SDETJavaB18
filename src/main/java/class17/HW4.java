package class17;

public class HW4 {
    // Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    private static void overload(int num1) {
        System.out.println(num1);
    }
    private static void overload(int num1, double num2) {
        System.out.println(num1 + num2);
    }
    private static void overload(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        overload(12);
        overload(12,15.2);
        overload("Happy Java Holidays");
    }
}

