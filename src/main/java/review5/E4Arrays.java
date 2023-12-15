package review5;

import java.util.Arrays;

public class E4Arrays {
    public static void main(String[] args) {

        String[] students = new String[5];
        students[0] = "Justyna";
        students[1] = "Anna";
        students[2] = "Aaron";
        students[3] = "Engin";
        students[4] = "Mia";

        for (int i = 0; i < students.length; i++) {

            if (students[i].equals("Aaron")) {
                students[i] = "Good Student";
            }
        }

        // If you just want to print the items in a row from array we can use this.
        System.out.println(Arrays.toString(students));
    }
}