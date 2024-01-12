package class23;

import java.util.HashSet;

/* Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class T4 {
    public static void main(String[] args) {


        HashSet<Student> students=new HashSet<>();
            students.add(new Student("Engin","123"));
            students.add(new Student("Justyna","456"));
            students.add(new Student("JustynaFriend","789"));

            for (Student s:students){
                s.printInfo();
            }
        }
    }

