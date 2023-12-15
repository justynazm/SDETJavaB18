package review4;
public class ForLoop {
    public static void main(String[] args) {

        // for(initialization; condition; increment/decrement) { code to repeat;
    // }

        // Say hello 4 times

        for(int i=0; i<4; i++) {
            System.out.println("Hello "+i);
        }

        for(int i=2; i<=10; i+=3) {
            System.out.println(i); //2 5 8

        }
        // print numbers from 10 till 2

        for(int i=10; i>=2; i--){
            System.out.print(i +" "); // no execution because is false

        }

        for(int i=10; i>=2; i++){
            System.out.print(i +" "); // 10 11 12 and enfinite
        }
    }
}
