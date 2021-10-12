package Basic_Program;

public class Task_10 {
    public static String datingRange(int age) {

        int minAge = age <= 14 ? (int)(age - 0.1 * age) : age / 2 + 7;
        int maxAge = age <= 14 ? (int)(age + 0.1 * age) : (age - 7) * 2;

        return minAge + "-" + maxAge;
    }
}
