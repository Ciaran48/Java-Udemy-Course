package accademy.learnprogramming;

public class Main {


    public static void main(String[] args) {
        //int,
        //32 bits - has a width of 32
        //Integer is a wrapper class, Wrapper class can be used for all primitive types
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

        //Byte, good to use for memory saving
        // 8 bits - has a width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum value is " + myMinByteValue);
        System.out.println("Byte Maximum Value is " + myMaxByteValue);

        //Short
        //16 bits - has a width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value is " + myMinShortValue);
        System.out.println("Short Maximum Value is " + myMaxShortValue);

        //Long
        //64 bits - has a width of 64
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value is " + myMinLongValue);
        System.out.println("Long Maximum Value is " + myMaxLongValue);

        //using a long the int that was too big earlier can be used
        long bigLongLiteralValue = 2147483648L;
        System.out.println(bigLongLiteralValue);

        //Arithmetic
        int myTotal = (myMinIntValue/2);
        //Need casting for this too work
        //byte myNewByteValue = (myMinByteValue/2);

        //Casting,
        // is treating or converting a data type as another
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue =(short) (myMinShortValue/2);

        //Challenge
        //Create a byte, short and int with any valid value
        //then create a long equal to 50000 plus 10 times the
        //sum of the int, byte and short values

        byte num1 = 100;
        short num2 = 200;
        int num3 = 300;
        long answer = 50000 + 10 * (num1+num2+num3);
        System.out.println(answer);






    }
}
