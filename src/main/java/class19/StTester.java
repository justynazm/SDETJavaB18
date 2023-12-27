package class19;

public class StTester {
    public static void main(String[] args) {
        Student[] arr = {new Student(), new SyntaxStudents(), new CollegeStudent(), new SchoolStudent()};
        for(int i=0; i<arr.length; i++){
            arr[i].homework();
            arr[i].exam();
            arr[i].study();
        }
    }
}
