package class3;
public class Task9 {
    // Traffic Light Actions:Declare a String variable trafficLight and set it to either "Red", "Yellow", or "Green".
    // Use if-else statements to print "Stop" if the light is "Red", "Caution" if the light is "Yellow",
    // and "Go" if the light is "Green"

    public static void main(String[] args) {

        String trafficLight="Yellow";
        if(trafficLight.equals("Red")){
            System.out.println("Stop");
        }else if(trafficLight.equals("Yellow")){
            System.out.println("Caution");
        }else if(trafficLight.equals("Green")){
            System.out.println("Go");
        }
    }
}
