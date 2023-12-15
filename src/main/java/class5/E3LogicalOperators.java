package class5;
public class E3LogicalOperators {
    public static void main(String[] args) {

        boolean condition1=true;
        boolean condition2=true;

        if(condition1 || condition2) { // con1 True, con2 True = True (if would  con1 F, con2 T = True
            System.out.println("If");
        }else{
            System.out.println("Else");
        }
    }
}
//     boolean condition1=true;
//     boolean condition2=false;
//     if(!(condition1 || condition2)) {   con1 T, con2 F= True but -->  !=not = False output is "Else"


