package Conditions;

public class TrafficLights {
    public static String updateLight(String current) {

        String result = "";

        if (current.equals("red")) {
            result = "green";
        }
        if (current.equals("green")) {
            result = "yellow";
        }
        if (current.equals("yellow")) {
            result = "red";
        }
        return result;
    }
}
