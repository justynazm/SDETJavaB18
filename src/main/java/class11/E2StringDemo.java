package class11;
public class E2StringDemo {

    public static void main(String[] args) {

        // Creating an object of String class
        String str="Batch 18";
        String  str2= new String("Batch 18");
        System.out.println(str.length());
        System.out.println(str2.length());

        boolean isEmpty=str.isEmpty();// if you see "is" after str that will be a boolean in output
        System.out.println(isEmpty);
    }
}
