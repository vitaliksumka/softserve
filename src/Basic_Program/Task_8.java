package Basic_Program;

public class Task_8 {
    public static int century(int number) {
        int count = 0;
        while(number > 0){
            number = number - 100;
            count = count + 1;
        }
        return count;
    }
}
