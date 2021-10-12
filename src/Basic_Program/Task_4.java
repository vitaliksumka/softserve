package Basic_Program;

public class Task_4 {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        if(wallLength % pixelSize == 0) {
            return true;
        }
        return false;
    }
}
