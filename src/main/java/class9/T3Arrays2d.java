package class9;
public class T3Arrays2d {
    // Create a 2D array(shorter way) in which first array will cosist of 4 names and second array will contain grades.
    // Then your program should print name of the students that has A and B grade

    public static void main(String[] args) {
        String[][] student = {
        {"Justyna", "Anna", "Mia", "Karina"},
        {"A", "A", "A", "A"}};
        for(int i=0; i<student[0].length;i++){
            if(student[1][i].equals("A") || student[1][i].equals("B"))
            System.out.println(student[0][i]+" "+student[1][i]);
        }
    }
    }
