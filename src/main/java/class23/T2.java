package class23;

import java.util.Set;
import java.util.TreeSet;

// Create a Set in which you need to add names of the countries (5). In this set we want all objects to be sorted
// in alphabetical order. Using 2 different ways retrieve all elements from set.
public class T2 {
    public static void main(String[] args) {

        Set<String> countriesSet = new TreeSet<>();
        countriesSet.add("Usa");
        countriesSet.add("Polska");
        countriesSet.add("Canada");
        countriesSet.add("Mexico");
        countriesSet.add("Italy");
        countriesSet.add("Spain");
        System.out.print(countriesSet);

        System.out.println();

        for (String country: countriesSet) {
            System.out.print(country+" ");
        }
    }
}