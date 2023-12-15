package class9;
public class T7Arrays2d {
    // Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
    // african countries. Then print all values from that array using 2 different loops
    // and calculate how many total countries have beed stored

    public static void main(String[] args) {

        String[][] countries = {
                {"USA", "Canada", "Mexico", "Cuba"},
                {"Brazil", "Argentina", "Peru", "Colombia"},
                {"Poland", "Germany", "Ukraine", "Italy"},
                {"China", "India", "Japan", "Pakistan"},
                {"Nigeria", "Egypt", "Congo", "Kenya"}
        };

        int totalCountries = 0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                totalCountries++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total countries stored: " + totalCountries);
        System.out.println();

        for (String[] c : countries) {
            for (String x : c) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total countries stored: " + totalCountries);
        }
        }

