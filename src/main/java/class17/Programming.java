package class17;

public class Programming {
    // Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    // then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.

    public Programming() {
        System.out.println("I love programming languages");
    }

    public Programming(String str){
        System.out.println("I love "+ str);
    }
}
class ProgrammingTest{
    public static void main(String[] args) {
        Programming pr1 = new Programming();
        Programming pr2 = new Programming("Java");
    }
}