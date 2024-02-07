package Section5;

public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int leveCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if(gameOver){
            finalScore += (leveCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
