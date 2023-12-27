package class21;

public class AnimalTester {

    public static void main(String[] args) {

        Cat c=new Cat();
        c.eat();
        c.speak();
        c.sleep();
        Animal c2=new Cat();

        Animal[] arr={new Cat(), new Dog()};

        for(Animal a:arr){
            a.eat();
            a.speak();
            a.sleep();
        }
    }
}
