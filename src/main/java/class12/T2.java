package class12;
public class T2 {
    // Create a String that should be combination of letters, numbers and special characters.
    // Find out how many Alphabets (abd AZ) characters are there in the String.

    public static void main(String[] args) {

        String str = "bkfdSAHBDSH2232398487#Y*&#$%";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());


    }

}
