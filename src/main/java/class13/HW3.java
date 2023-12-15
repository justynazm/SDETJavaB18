package class13;

public class HW3 {
    public static void main(String[] args) {

// Create a method createEmail(). Based on values of users firstName, lastName and email type,
// your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    HW3 tt = new HW3();
    String ttt = tt.createEmail("john", "snow", "gmail");
        System.out.println(ttt);
}
    String createEmail(String firstName, String lastName, String emailType){
    String info=firstName+lastName+"@"+emailType+".com";
    return info;
        }
        }

