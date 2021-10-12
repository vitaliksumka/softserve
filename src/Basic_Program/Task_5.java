package Basic_Program;

public class Task_5 {
    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}
