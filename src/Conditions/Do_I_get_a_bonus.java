package Conditions;

public class Do_I_get_a_bonus {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus == true) {
            int result1 = salary * 10;
            String str = String.valueOf(result1);
            return "\u00A3" + str;
        } else {
            String str2 = String.valueOf(salary);
            return "\u00A3" + str2;
        }
    }
}
