package class12;
public class E2StringDemo {

    public static void main(String[] args) {

        String str="It's Savera's Birthday today. It's Sunday. Today is Java Class";
        String [] wordArr = str.split(" ");
        System.out.println(wordArr.length);
        System.out.println(wordArr[0]);
    }
}

