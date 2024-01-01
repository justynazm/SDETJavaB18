package class22;

import java.util.ArrayList;
// print yes if a name contains the letter o otherwise no for all names
public class T2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");

        for (String s : names) {
            if (s.contains("o")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}