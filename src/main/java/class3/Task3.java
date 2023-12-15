package class3;
public class Task3 {
    // Create a java program to store 2 values for expected and actual hours. Your program should check
    //if actual hours are more than expected the program should print "You will love the course and you will succeeed",
    // otherwise"Course will be very hard for you!"

    public static void main(String[] args) {
        int expectedHrs=25;
        int actualHrs=28;
        if(actualHrs>expectedHrs) {
            System.out.println("You will love the course and you will succeed");
        }else{
            System.out.println("Course will be very hard for you");
        }
    }
}
