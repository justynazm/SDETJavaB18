package class8Arrays;
public class T1 {
    // Write a program to count how many times the name Jacek as appeared in this array
    public static void main(String[] args) {
        String[] names={"Justyna", "Jacek", "Anthony", "Frank", "Jacek"};
        int count=0;
        for(int i=0; i<names.length; i++){
            if(names[i].equals("Jacek")){
                count++;
            }
        }
        System.out.println("Jacek appeared "+count+" times");
    }
}
