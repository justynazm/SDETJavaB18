package class17;

class Math {

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2){
        System.out.println(num1+num2);

    }
    static void add(double num1, double num2, double num3){
        System.out.println(num1+num2+num3);
    }

    }

public class E1MethodOverloading {

    public static void main(String[] args) {
        Math.add(10,20);
        Math.add(10.5,25.5);
        Math.add(15.5,25.5,25.5);
    }

}
