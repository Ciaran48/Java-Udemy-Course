package accademy.learnprogramming;
/*Write a method named sumFirstAndLastDigit with one parameter of type int called number.

        The method needs to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value.*/
public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int digit = 0;
        if (number <0){
            return -1;
        }
        int firstDigit = number % 10;
        while (number >0){
            digit = number % 10;
            number = number / 10;
        }

        firstDigit += digit;
        return firstDigit;
    }

}
