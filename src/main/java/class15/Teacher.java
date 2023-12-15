package class15;

public class Teacher {
    // Write a Teacher class that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given Teacher using displayInfo method.

    private String name;
    private String address;

    // Constructor to initialize name and address

    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating an instance of Teacher and displaying info
        Teacher teacher = new Teacher("Asghar", "Pakistan");
        teacher.displayInfo();
    }
}