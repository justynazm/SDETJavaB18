package class14;

public class SyntaxEmployee {
    // Create a Class called SyntaxEmployee:
    // * create three variables empID, salary and set the CEO to "Sumair"
    // * create 2 objects of the class SyntaxEmployee
    // * set the value of eID, salary for each of the objects
    // * print out the eID, salary and CEO for each of the objects

    int empID;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {

        SyntaxEmployee nEm1 = new SyntaxEmployee();
        nEm1.empID = 2345456;
        nEm1.salary = 100000;
        System.out.println(nEm1.empID);
        System.out.println(nEm1.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println();
        SyntaxEmployee nEm2=new SyntaxEmployee();
        nEm2.empID=34354646;
        nEm2.salary=125000;
        System.out.println(nEm2.empID);
        System.out.println(nEm2.salary);
        System.out.println(SyntaxEmployee.CEO);


    }

    }