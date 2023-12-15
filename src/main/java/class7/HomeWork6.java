package class7;
public class HomeWork6 {
    // From an array of integer elements find the largest number.
    public static void main(String[] args) {

        int[] num={5,12,20,33,40};
        int largestNum=0;
        for(int i=1; i<num.length; i++) {
            if (num[i] >largestNum) {
                largestNum = num[i];
            }
        }
        System.out.println(largestNum);
    }
}
