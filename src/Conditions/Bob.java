package Conditions;

public class Bob {
    public static int enough(int cap, int on, int wait) {
        int result = 0;
        int resultCap = cap - on;
        if (resultCap == wait) {
            result = 0;
        } else {
            result = on - wait;
        }
        return result;
    }
}
