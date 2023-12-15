package class5;

import java.util.Scanner;

public class T8HomeWorkWay1 {
    // Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
    // Based on operator provide the result to user.
    // Please complete this assignment in 2 ways: using if statement and switch case.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=sc.nextDouble();
        System.out.println("Enter second number");
        double num2=sc.nextDouble();
        System.out.println("Enter an operator(+,-,*,/)");
        String a=sc.next();

        if(a.equals("+")) {
            System.out.println("Result is " + (num1 + num2));
        }else if(a.equals("-")) {
            System.out.println("Result is " + (num1 - num2));
        }else if(a.equals("*")) {
            System.out.println("Result is " + (num1 * num2));
        }else if(a.equals("/")) {
            System.out.println("Result is " + (num1 / num2));
        }else{
            System.out.println("Invalid");
        }
    }
}
