package accademy.learnprogramming;

public class Main {

    //Integer is a wrapper class, Wrapper class can be used for all primitive types
    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value is " + myMinIntValue);
        System.out.println("Integer Maximum value is " + myMaxIntValue);
        //Overflow is over maximum number range
        System.out.println("Busted Max value is " + (myMaxIntValue + 1));
        //Underflow is under maximum number range
        System.out.println("Busted Min value is " + (myMinIntValue - 1));

        // literal int value is outside range so intellij picks it up
        // int myMaxIntTest = 2147483648;
    }
}
