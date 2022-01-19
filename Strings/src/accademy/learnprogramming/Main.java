package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //Strings,
        //immutable - can't change after created, new string is created by java
        //Code is inefficient using String as the same variable as seen below
        //basic
        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("myString is equal to " + myString);

        //numeric
        String numberString = "250";
        numberString = numberString + "250";
        System.out.println(numberString);

        //Addition
        //doesn't work same with other numeric data types
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

    }
}
