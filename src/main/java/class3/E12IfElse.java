package class3;

public class E12IfElse {
    public static void main(String[] args) {
        String name="Sino";
        // whenever we have a non primitive type we should never use == sign

        if(name.equals("Sino")){ // if we put (!name.equals("Sino")) ! before name.equals means NOT EQUALS
            System.out.println("Fast");
        }else{
            System.out.println("Moderate");
        }
    }
}
