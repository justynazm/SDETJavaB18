package review7;

public class Dog {

    String name;

    String color;

    int age;

    double weight;
// Whenever you are planning to reuse a variable in more than
// 2 methods of your class create an instance variable for that

    public Dog(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }


    void printInfo() {
        System.out.println(name + " " + color + " " + age + " " + weight);
    }

    int sumArray(int [] arr){

        //Whenever I am writing any logic in a method or loop or if condition
        // and I temporarily need to store some data then we should create
        // a local variable

    int sum = 0;
    for(int i=0; i<arr.length;i++){

        sum += arr[i];
    }
    return sum;

    }
}
