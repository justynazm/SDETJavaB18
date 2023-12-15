package class4;
public class T1 {
    public static void main(String[] args) {
        // Create a Java program and call it a Donor.
        // In order to be eligible to donate your blood you have to be 18 yrs old.
        // Also once you identify age eligibility then we have to see if person
        // matches weight it more than 110 lbs -->then he/she is eligible,
        // otherwise we cannot accept such a patient

        double age = 15;
        double weight = 180;

        if (age >= 18) {

            if (weight >= 110) {
                System.out.println("You are eligible for blood donation");
            } else {
                System.out.println("You are not eligible for a blood donation");
            }
            } else {
                System.out.println("We cannot accept such patient");
            }
        }
    }

