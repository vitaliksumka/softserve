package Conditions;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        if (yearTo > birth) {
            int result1 = yearTo - birth;
            if (result1 == 1) {
                String result = "You are " + result1 + " year old.";
                return result;
            }
            String result = "You are " + result1 + " years old.";
            return result;

        } else if (yearTo < birth) {
            int result2 = birth - yearTo;
            if (result2 == 1) {
                String result = "You will be born in " + result2 + " year.";
                return result;
            }
            String result = "You will be born in " + result2 + " years.";
            return result;

        } else {
            String result = "You were born this very year!";
            return result;
        }
    }
}