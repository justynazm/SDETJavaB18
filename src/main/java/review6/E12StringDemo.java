package review6;
public class E12StringDemo {
    public static void main(String[] args) {

        String str="My name is James my Number is 91245687";
        String number=str.replaceAll("[^0-9]",""); // ^ --- means NO
        System.out.println(number);

        System.out.println();

        String str1="My name is James my Number is 91245687";
        String str2="My name is James my Number is 91245687";
        String str3="My name is James my Number is 91245687";

        StringBuilder stringBuilder=new StringBuilder("Java");


    }
}
