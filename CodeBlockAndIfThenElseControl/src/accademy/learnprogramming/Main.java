package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Score is less than 5000 and more than 1000");
//
//        } else if (score < 1000) {
//            System.out.println("score is less than 1000");
//
//        } else {
//            System.out.println("Here we go");
//        }

        if(gameOver == true){
            //scope, variable in a code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score is " + finalScore);
        }

        //can't call finalScore outside of code block

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver == true){
            //scope, variable in a code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score is " + finalScore);
        }


    }
}
