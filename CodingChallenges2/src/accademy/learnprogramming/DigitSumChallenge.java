package accademy.learnprogramming;
/* Write a method called sumDigits that has one int parameter called number.
if parameter >=10, process the number and return sum of all digits otherwise
return -1 and also for negative numbers

n % 10, extract the least significant digit
n = n/10, discard the least significant digit

*/
public class DigitSumChallenge {
    public static int sumDigits(int number){
        int sum = 0;
        if (number <10){
            return -1;
        }
        else while (number > 0){
            sum += number % 10;
            number = number /10;
        }

            return sum;
    }

}
