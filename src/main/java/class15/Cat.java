package class15;

public class Cat {
    // Write a java class that have 4 constructors with 4 different access
    // levels of constructors (private, public, fefault, protected)
    // and create 4 objects of this class: 1 - inside same class;
    // 2- from outside the class; 3 - from different class inside different
    // package and observe result.

    private String name;

    private String color;

    private int age;

    public Cat(String cName, String cColor, int cAge) {
        this.name = cName;
        this.color = cColor;
        this.age = cAge;
    }

    public void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }

    public static void main(String[] args) {
        Cat c=new Cat("Kitti", "White", 13);
        c.printInfo();
    }
}

