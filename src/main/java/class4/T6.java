package class4;

import java.util.Scanner;

public class T6 {
    // Create a Java program that will ask if user has credit card or not. If you user does not have
    // a credit card then offer them. If they do have one ask what is balance of the card is larger than 1000,
    // tell them to pay off immediately, otherwise you can tell them that they can spend more.

    public static void main(String[] args) {

        System.out.println("Do you have a credit card yes/no");
        Scanner sc = new Scanner(System.in);
        String creditCard=sc.nextLine();
        if(creditCard.equals("yes")) {
            System.out.println("What is the balance on your credit card?");
            double balance = sc.nextDouble();
            if (balance > 1000) {
                System.out.println("Please pay off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }else{
        }

    }
}



