package class14;

public class PersonTester {

    public static void main(String[] args) {

        Person p1=new Person();
        p1.name="Zeeshan";
        p1.age=22;
        p1.weight=60;
        p1.printInfo();

        Person p2=new Person();
        p1.name="Sino";
        p1.age=25;
        p1.weight=70;
        p1.printInfo();
        System.out.println(Person.noOfEye);
    }
}