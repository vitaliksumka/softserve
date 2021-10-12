package Conditions;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean flag = false;
        int men = flower1 % 2;
        int woomen = flower2 % 2;
        if (men == 0 && woomen != 0) {
            flag = true;
        } else if (men != 0 && woomen == 0) {
            flag = true;
        }
        return flag;
    }

}
