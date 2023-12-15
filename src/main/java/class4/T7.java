package class4;

import java.util.Scanner;

public class T7 {
    // Write a program to ask user to enter numbers of worked years and annual salary.
    // If user worked for more or equals to 5 years then user is eligible for the bonus,
    // otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus=5000, otherwise bonus=3000.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of years have worked");
        double years=scan.nextDouble();
        System.out.println("Enter your annual salary");
        double salary=scan.nextDouble();
        if(years>=5) {
            System.out.println("You are eligible for the bonus");
            if (salary >= 5000) {
                System.out.println("Your bonus is $5000");
            } else {
                System.out.println("Your bonus is $3000");
            }
        }else{
            System.out.println("You are not eligible for the bonus");
            }
        }
    }

