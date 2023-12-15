package review6;
public class Person {
    String name;
    int age;
    double weight;
    double height;

    void eat(){
        System.out.println("Eating ......");
    }

    String getName() {
        return name;
        }

        public static void main(String[] args){
        Person p = new Person();
        p.name = "Karimi Naughty";
        p.age=22;
        p.weight = 120;
        p.height=5.4;
            System.out.println(p.name);
        }

    }

