public class T3DoWhile {
    public static void main(String[] args) {
        // Print numbers from 100 to 1 using "do" "while"
        //Expected output 100 99 98 97...1

        int y=100;

        do {
            System.out.print(y + " ");
            y--;
        }while (y>=1);

    }

}
