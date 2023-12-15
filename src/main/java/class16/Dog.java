package class16;

public class Dog extends Animal {


    void bark(){
        System.out.println("Wuff wuff");
    }
    void sleep(){
        System.out.println("ZZzzzzZZZzzz");

    }

    public void printInfo() {
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
