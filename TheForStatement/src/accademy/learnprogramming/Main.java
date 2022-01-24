package accademy.learnprogramming;

/*
    init = initialised once at the start
    termination = at what point do we exit
    increment = expression invoked each iteration of the loop

    for (init; termination; increment){

        }*/

public class Main {

    public static void main(String[] args) {

        for(int i =0; i<6; i++){
            System.out.println("Loop " + i + " hello");
        }
        for(int i =2; i<9; i++){
            System.out.println (String.format("%.2f",calculateInterest(10000, i)));
        }
        for(int i =8; i>1; i--){
            System.out.println (String.format("%.2f",calculateInterest(10000, i)));
        }


        //Check a range of numbers are prime numbers
        int counter = 0;
        for (int i = 1; i < 100; i++) {
            if (isPrime(i) == true) {
                counter +=1;
                if (counter > 2) {
                    System.out.println(counter);
                    break;
                }
            }

        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    //determine if prime number
    //prime number is a number that can only be divided evenly by 1 or itself
    //must be more than 1
    public static boolean isPrime(int n) {
        //can't be one
        if (n == 1) {
            return false;
        }
        //no number greater than n / 2 will divide into n
        //determine that its not a prime number
        for (int i = 2; i <= n / 2; i++) {
            //looking for other number that divides evenly
            if (n % i == 0) {
                return false;
            }
        }
        //if not then it is
        return true;
    }

}
