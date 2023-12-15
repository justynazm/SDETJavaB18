package class14;

public class HW2 {
    // Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

String vowels(String str){
    String str1 = str.replaceAll("[^e,u,o,i,e,a,A,E,I,O,U]"," ");
    return str1;
}

    public static void main(String[] args) {
        HW2 v = new HW2();
        String name = "Anthony & Frank";
        System.out.println(v.vowels(name));
    }
}
