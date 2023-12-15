package class4;
public class T2 {
    public static void main(String[] args) {

        // Write a program to find larger number among three numbers using nested if provided
        // by a user (numbers must be distinct)

        int num1=100;
        int num2=200;
        int num3=300;

        if(num1>num2){
            if(num1>num3){
            System.out.println("num1 is largest" + num1);
            }
        }else if(num2>num1){
            if(num2 > num3) {
                System.out.println("Num2 is largest" + num2);
            }
        }else if(num3>num1) {
            if (num3 > num2) {
                System.out.println("Num3 is largest" + num3);
            }
        }else{
            System.out.println("check again");
        }
    }
}
