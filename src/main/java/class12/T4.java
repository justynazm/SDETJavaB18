package class12;

public class T4 {
    /*
    Write a program that reads two people,s first names and if they expecting boy or girl?
    Base on the input suggests a name for a baby:
    Example output:
    Mom's first name? Mary
    Dad's first name? Daniel
    Boy or Girl? boy
    Suggested baby name: DANRY

    Example output:
    Mom's first name? Mary
    Dad's first name? Daniel
    Boy or Girl? girl
    Suggested baby name: MAIEL
    */

    public static void main(String[] args) {

        String fatherName="Carlos";
        String motherName="Taylor swift";
        boolean isBoy=false;

        if(isBoy) {
            // first part false
            String fatherFirstPart = fatherName.substring(0, fatherName.length() / 2);
            String motherLastPart = motherName.substring(motherName.length() / 2, motherName.length());
            System.out.println(fatherFirstPart.trim() + motherLastPart.trim());
        }else{  // true
            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());
        }



    }


}
