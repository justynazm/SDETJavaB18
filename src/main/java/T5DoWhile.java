public class T5DoWhile {
    public static void main(String[] args) {
        // Print only odd numbers from 100 to 1 using "do" "while"
        // Expected output 99 97 95 93...1

        int i=99;

        do {
            System.out.println(i+" ");
            i=i-2;
        }while(i>=1);
    }
}
