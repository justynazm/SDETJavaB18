package review3;
public class LogicalAnd {
    // for logical && - all conditions need to be true to get TRUE
    public static void main(String[] args) {

        boolean rain=true;
        boolean cold=true;

        if(cold && rain){
            System.out.println("I am staying home");
        }

        boolean messageDisplayed=true;
        String errorMessage = "Invalid credentials";
        if (messageDisplayed && errorMessage.equals("Invalid Credentials")) {
            System.out.println("Test Case passed");
        }else{
            System.out.println("Test Case failed");
            }
        }
    }

