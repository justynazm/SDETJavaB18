package class11;

public class E1StringDemo {
    public static void main(String[] args) {
    // Create the object of that clss
    /*
    String => Data type
    str => variable name
    new String() => create the object of String
    */

        String str=new String("Hello 2134@#$%*");
        // calling the length method using the str object
        System.out.println(str.length()); // .length is a method
        System.out.println(str.toUpperCase());
        // we can store the results of a method as well
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str.concat("Hello Batch 18"));


    }
}
