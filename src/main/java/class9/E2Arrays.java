package class9;
public class E2Arrays {
    public static void main(String[] args) {

        int[][] matrix={
                {10,20,50},    //[0]
                {25,35,66},    //[1]
                {80,90,78,45}, //[2]
                {45,55,66}     //[3]
        };

        System.out.println(matrix[1][1]); //35
        System.out.println(matrix[0][2]); //50
        System.out.println(matrix[3][2]); //66


        System.out.println(matrix.length); //4 - count of all raws
        System.out.println(matrix[0].length); //3 - count of elements in a raw
        System.out.println(matrix[2].length); //4 - count of elements


    }

}
