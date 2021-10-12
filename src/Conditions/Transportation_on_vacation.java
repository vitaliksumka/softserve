package Conditions;

public class Transportation_on_vacation {
    public static int rentalCarCost(int d) {
        int result = 0;

        if (d >= 1 && d <= 2) {
            result = 40 * d;
        }

        if (d >= 7) {
            result = 40 * d - 50;
            //
        }

        if (d >= 3 && d <= 6) {
            result = 40 * d - 20;
        }

        return result;
    }
}
