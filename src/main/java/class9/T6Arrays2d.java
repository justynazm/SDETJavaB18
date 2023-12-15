package class9;
public class T6Arrays2d {
    // Create a 2D array or integer type where you will store odd and even numbers in 3 rows
    // and 4 columns. Develop a program which will identify/print the even mumbers only.

    public static void main(String[] args) {

        int[][] num = {
                {12, 34, 54, 67},
                {45, 35, 22, 26},
                {2, 23, 56, 73}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
