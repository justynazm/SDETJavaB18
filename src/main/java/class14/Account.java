package class14;

public class Account {

    String accountNumber="1234567";

    private double balance=350;

    private String userName="user123";

    private String password="Pass123";

    void printHello(){
        System.out.println("Welcome to Bank of America");
    }

    public void Hello(){
        System.out.println("Welcome Costumer");
    }
    private void printInfo() {
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {

        Account a = new Account();
        System.out.println(a.password);
        a.printInfo();

    MyClass m=new MyClass();

    }

    private static class MyClass{

        }

    }


