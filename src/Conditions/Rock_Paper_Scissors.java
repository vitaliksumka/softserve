package Conditions;

public class Rock_Paper_Scissors {

    public static String rps(String p1, String p2) {

        String result = "";

        if (p1.equalsIgnoreCase(p2)) {
            result = "Draw!";
            return result;
        }

        if (p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("scissors")) {
            result = "Player 1 won!";
            return result;
        } else if (p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("paper")) {
            result = "Player 2 won!";
            return result;
        }

        if (p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("rock")) {
            result = "Player 2 won!";
            return result;
        } else if (p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("paper")) {
            result = "Player 1 won!";
            return result;
        }

        if (p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("rock")) {
            result = "Player 1 won!";
            return result;
        } else if (p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("scissors")) {
            result = "Player 2 won!";
            return result;
        }

        return result;
    }
}
