package class9;
public class E3Arrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };

        int[] row0 = matrix[0];
        System.out.println(row0.length);
        for (int n:row0) {
            System.out.print(n+" ");
        }
        System.out.println();
                // accessing individual elementsns from the 2d array
        System.out.println(matrix[2][2]);

    }
}