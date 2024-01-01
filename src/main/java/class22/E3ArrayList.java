package class22;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");

        System.out.println(names.size());
        System.out.println(names.contains("Hananana"));
        System.out.println(names);
        //System.out.println(names.remove("Kamla"));
        System.out.println(names.remove(3));// above and this line are correct
        System.out.println(names);

    }
    }

