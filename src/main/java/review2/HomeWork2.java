package review2;
public class HomeWork2 {
    //2.Create a Java program and store values of mortgage rate and mortgage price.
    // First, program should check if rate is higher than 4.5 user will not buy a house,
    // otherwise user will consider buying. Once user decides to buy a house,
    // if price of the house is larger than 100,000 than user will take a loan, otherwise user will pay cash.

    public static void main(String[] args) {

        double rate = 4.5;
        int price=98000;

        if(rate>=4.5) {
            System.out.println("User will buy a house");
            if(price>=100000) {
                System.out.println("User will take a loan");
            }else{
            }
        }
        System.out.println("User will pay cash");
    }
}
