package class12;
public class T6 {
    // How would you check if String is palindrome or not? aba=>true Abbc=>false

    public static void main(String[] args) {

        String str="Car";
        String reversedWord="";
        for(int i=str.length()-1; i>=0; i--){
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)) {
            System.out.println("It's a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }

    }
}
