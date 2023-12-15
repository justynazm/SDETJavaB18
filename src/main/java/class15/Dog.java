package class15;

public class Dog {

    private String name;

    private String breed;

    private String color;

    private int age;

    // this is Constructor below (it meeds to have same name as class:"Dog"
    public Dog(String dName,String dBreed,String dColor, int dAge){
        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;

    }

    void printInfo(){  // printInfo -- is name of method
        System.out.println(name+" "+breed+" "+color+" "+age);

    }

}
