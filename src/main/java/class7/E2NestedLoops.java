package class7;
public class E2NestedLoops {

    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) {  //<--- this is outer loop (controling like wife thats why there ate 3 lines
            //   (j=0   j++ = 1)

            for (int i = 0; i < 5; i++) {  // <--- this is inner loop.  (i=0   i++ = 1)
                System.out.print("*");

            }
            System.out.println(); // <--- that moves to the next line in output

            //

        }
    }
}