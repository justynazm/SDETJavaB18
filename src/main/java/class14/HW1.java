package class14;

public class HW1 {
    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    String s(String str) {

     String reversed = " ";
     for(int i = str.length()-1; i>=0; i--){
      reversed = reversed + str.charAt(i);
     }
return reversed;
     }

     public static void main(String[] args){
     HW1 s1=new HW1();

      System.out.println(s1.s("Merry Christmas"));
     }


}