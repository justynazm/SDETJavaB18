package class16;

public class Cat extends Animal {

    String name;

    String color;

    int age;

    double weight;

    void bark(){
        System.out.println("Wufff wufff");
    }
    void sleep(){
        System.out.println("ZZzzzzZZZzzz");
    }

    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
