package class5;

import java.util.Scanner;

public class T2 {
    // Write a program that will prompt the user for day number and print whether it is a weekend or weekday
    // If any day from1-5 --> output "It is a weekday", anyday from 6-7 --> output "It is a weekend",
    // any other day -->output "Invalid day". Test your task for -1 3 6 and 8.

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a day number from 1 to 7");
        int dayNumber=sc.nextInt();
        if(dayNumber>=1&&dayNumber<=5) {
            System.out.println("Weekday");
        } else if (dayNumber==6 &&dayNumber<=7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid");
        }

    }
}
