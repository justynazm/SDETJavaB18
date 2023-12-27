package class18;

// Create a class 'Degree' having a method 'getPrerequisite' that prints
// "To get a degree you need high school diploma"
// * Class 'Degree' has 2 subclasses namely 'Bachelors' and 'Masters'.
// In Masters class override method 'getPrerequisite'.
// * Call the method by creating an object of each of the 3 classes

public class Degree {


    public void getPreReq(){
        System.out.println("To Get a Degree we need to have a School diploma");
    }
}

class Master extends Degree{

    public void getPreReq(){
        System.out.println("To get a Master degree we need to have Bachelors Degree");
    }
}

class Bachelors extends Degree{

}
class DegreeTester{

    public static void main(String[] args) {
        Master m=new Master();
        m.getPreReq();
        Bachelors b=new Bachelors();
        b.getPreReq();

    }
}