package review3;

import java.util.Scanner;

public class SwitchAndScanner {
    /*
    Ask user where is he from and based on the country specify favorite food
     */
    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);

        System.out.println("Please enter where are you from");
        String country=capture.nextLine();

        switch (country) {

            case "India":
                System.out.println("You love biriyani");
                break;
            case "Egypt":
                System.out.println("You love Koshary");
                break;
            case "Georgia":
                System.out.println("You love Hachapuri");
                break;
            case "Moldova":
                System.out.println("Mamaliga");
                break;
            case "Kzakhstan":
                System.out.println("You love beshparmak");
                break;
            case "USA":
                System.out.println("You love burger and fries");
                break;
            default:
                System.out.println("I do not know your favorite food");


        }

    }
}
