package class4;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=sc.nextInt();

        if(age>=18) {
            System.out.println("I will issue a driver licence to you");
        }else{
            System.out.println("for now you can only have learners permit");
        }
    }
}
