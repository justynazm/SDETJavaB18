package review2;
public class ElseIfBlock {
    public static void main(String[] args) {

        int worldCup=2014;

        if(worldCup==2002) { //False
            System.out.println("Host country is Korea and Japan"); //False
        }else if (worldCup==2006) {
            System.out.println("Host country is Germany"); //False
        }else if (worldCup==2010) {
            System.out.println("Host country is South Africa"); //False
        }else if (worldCup==2014) {
            System.out.println("Host country is Brazil"); //True ->this will be printed
        }
    }
}
