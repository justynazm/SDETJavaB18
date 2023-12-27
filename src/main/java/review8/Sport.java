package review8;

public class Sport {

        // synthax : dataType and name --- instance variables
        // static variables
        static boolean fun;
        String type;
        String teamName;
        int numberOfPlayers;
        String location;
        String coach;
        // constructor - use class name
        Sport(String type, String teamName){
            this.type=type;
            this.teamName=teamName;
        }
        // another constructer below
        Sport(String type, String teamName, int numberOfPlayers, String location, String coach){
            this.numberOfPlayers=numberOfPlayers;
            this.location=location;
            this.coach=coach;

        }
        // synthax of the method: void(return type) and name(){
        void play(){
            System.out.println("We play "+type);
        }
        // Local variable below
        void watch(String stream){
            System.out.println("I am watching "+type+" on "+stream);
        }
    }


