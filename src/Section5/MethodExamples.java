package Section5;

public class MethodExamples {
    public static void main(String[] args) {
        calculateScore(true, 100, 5, 100);
        calculateScore(true, 500, 8, 50);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
