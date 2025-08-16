public class Method_Overloading {

    /*
    public static void doSomething(int ParameterA) {

    }

    public static void doSomething(float parameterB) {

    }

    public static void doSomething(boolean parameterC) {

    }

    public static void doSomething(int parameterA, int parameterB) {

    }

    */

    public static void main(String[] args) {

        int newScore = calculateScore("Ant", 600);
        System.out.println("The new score is: " + newScore);

        int newScore1 = calculateScore(700, "Tom");
        System.out.println(newScore1);

    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " score is " + score);
        return score * 1000;
    }

    public static int calculateScore(int score, String playerName) {

        System.out.println("Player " + playerName + " score is " + score);
        return score * 1000;
    }



    // the above are all valid overload methods
}
