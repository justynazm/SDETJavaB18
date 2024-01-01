package class22;
// Create an arrayList of drinks call it. If any drink has letter "a" or "e" replace the whole word with water.

import java.util.ArrayList;

public class T4 {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("water");
        drinks.add("juice");
        drinks.add("lemonade");

        for (int i = 0; i < drinks.size(); i++) {
            String d = drinks.get(i);
            if (d.contains("a") || d.contains("e")) {
                drinks.set(i, "water");
            }
        }

        System.out.println(drinks);
    }
}
