package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // You cannot write a method in a method

//        boolean gameOver = true;
//        int score = 800;
//        int levelComplete = 5;
//        int bonus = 100;
//
//        int highScore = calculateScoreSave(true, 10000, 8, 200);
//        System.out.println("final score " + highScore);
//        calculateScore(gameOver, score, levelComplete, bonus);
//        calculateScore(true, 10000, 8, 200);
        int score = 999;
        int position = calculateHighScorePosition(score);
        String playerName = "Jim";
        displayHighScore(playerName, position);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //void means don't return
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static int calculateScoreSave(boolean gameOver, int score, int levelCompleted, int bonus) {
        //void means don't return
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else return -1;

    }
    //Challenge
    // create a method that takes 2 parameters name and position
    //display players name with a message mentioning the score
    //including the position they got.
    //create another method to get the highscore position with one argument only
    // return as an int; >1000 = 1, >500 and <1000 = 2, >100 and  <500 = 3 all
    //others should return 4; Call both methods
    public static void displayHighScore(String playerName, int position) {

        System.out.println(playerName + " got the number " + position + " position");

    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000){
            return 1;
        }else if (score >= 500 && score <1000) {
            return 2;
        }else if (score >= 100 && score <500){
            return 3;
        }else return 4;
    }
}
