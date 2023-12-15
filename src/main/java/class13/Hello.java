package class13;
public class Hello {
    // Create a method that will say Hello in different language based
    // on the country that will passed when method is executed. Do it for any five countries.

    void hello (String country){
        if (country.equalsIgnoreCase("Poland")) {
            System.out.println("Cześć");
        }else if(country.equalsIgnoreCase("USA")) {
            System.out.println("Hello");
        }else if(country.equalsIgnoreCase("Mexico")) {
            System.out.println("Hola");
        }else if(country.equalsIgnoreCase("Italy")){
            System.out.println("Ciao");
        }else if(country.equalsIgnoreCase("Romania")){
            System.out.println("Bunâ");
        }else{
            System.out.println("Country is not on the list");
        }
    }
}
