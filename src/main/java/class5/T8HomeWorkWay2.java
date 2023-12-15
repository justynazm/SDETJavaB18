package class5;

import java.util.Scanner;

public class T8HomeWorkWay2 {
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

        switch(a){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid");




        }

    }
}
