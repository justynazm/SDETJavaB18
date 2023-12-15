package class5;

import java.util.Scanner;

public class T4 {
    // Write a program for user to enter his/her birth month. Based on the month define the season.
    // Example: if user is born in March, April, May --> season = "Spring" if user is born in June, July, August
    // --> season = "Summer" etc.
    // At the end of the program we should see 1 output as "You were born in the season ___"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth month: ");
        String monthName=sc.next();
        String season;
        if (monthName.equalsIgnoreCase("December")||
        monthName.equalsIgnoreCase("January")||
        monthName.equalsIgnoreCase("February")){
            season = "Winter";
        }else if (monthName.equalsIgnoreCase("March")||
        monthName.equalsIgnoreCase("April")||
        monthName.equalsIgnoreCase("May")){
            season = "Spring";
        }else if (monthName.equalsIgnoreCase("June")||
        monthName.equalsIgnoreCase("July")||
        monthName.equalsIgnoreCase("August")){
            season = "Summer";
        }else if (monthName.equalsIgnoreCase("September")||
        monthName.equalsIgnoreCase("October")||
        monthName.equalsIgnoreCase("November")){
            season = "Autumn";
        }else{
            season = "Invalid";
        }
        System.out.println("You were born in the season " + season);
        }
        }