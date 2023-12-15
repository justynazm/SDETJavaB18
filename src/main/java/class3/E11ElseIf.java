package class3;
public class E11ElseIf {
    public static void main(String[] args) {

        int day=1;

        if(day==1) {//this is true and rest of conditions below are false that's why they are ignored and output is Monday
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday"); // False
        }else if(day==3){
            System.out.println("Wednesday"); // False
        }else if(day==4){
            System.out.println("Thursday"); // False
        }else if(day==5) {
            System.out.println("Friday"); // False
        }else if(day==6) {
            System.out.println("Saturday"); // False
        }else if(day==7) {
            System.out.println("Sunday"); // False
        }else{
            System.out.println("Wrong day");


        }

        }
    }

