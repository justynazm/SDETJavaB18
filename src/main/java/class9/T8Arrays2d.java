package class9;
public class T8Arrays2d {
    // Create a 2D array of integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

    public static void main(String[] args) {

        int [][] num={
                {2,4,15},
                {3,5,16},
                {4,6,17}
        };
        int sum=0;
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                sum=sum+num[i][j];
            }
        }
        System.out.println("The sum of all numbers is "+sum);
    }
}
