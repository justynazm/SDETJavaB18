package class7;
public class HomeWork5 {
    // Create an array of integers and calculate the sum of all elements in an array

    public static void main(String[] args) {
        int[] num={2,12,22,32,42};
        int sum=0;
        for(int i=0;i<5;i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }

}
