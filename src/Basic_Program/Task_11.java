package Basic_Program;

public class Task_11 {

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c < 0) {
            return (c + " is freezing temperature");
        } else {
            return (c + " is above freezing temperature");
        }
    }

    public static double convertToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
