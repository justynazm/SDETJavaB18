public class T9Loop {
    // Print odd numbers between 20 and 50 (using 2 different loos)

    public static void main(String[] args) {

        for(int i=20;i<=50;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int i=20;
        while(i<=50){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        i++;
        }

    }
}
