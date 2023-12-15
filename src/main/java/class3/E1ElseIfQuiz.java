package class3;

public class E1ElseIfQuiz {
    public static void main(String[] args) {
        int age=20;

        if(age<1) {// false
            System.out.println("Baby");
        }else if(age <20){ //false
            System.out.println("teenager");
        }else if(age <30){ //true - that's why it is output
            System.out.println("Still young");
        }else if(age <50) {
            System.out.println("A little old");
        }else{
            System.out.println("Old");
        }
    }
}
