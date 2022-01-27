package accademy.learnprogramming;

/*Write a method called numberToWords with one int parameter named number.

        The method should print out the passed number using words for the digits.

        If the number is negative, print "Invalid Value".

        To print the number as words, follow these steps:

        1. Extract the last digit of the given number using the remainder operator.
        2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
        Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
        3. Remove the last digit from the number.
        4. Repeat Steps 2 through 4 until the number is 0.

        The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above
        will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.

        The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed
        number would be 432. The method  reverse should also reverse negative numbers.

        Use the method reverse within the method numberToWords in order to print the words in the correct order.

        Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method
        numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.

        The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative,
        return -1 to indicate an invalid value.
        For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).*/
public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int num1 = getDigitCount(number);
        number = reverse(number);
        int num2 = getDigitCount(number);
        String numWords = "";

        if (number == 0){
            numWords += "Zero ";
        }

        if (number > 0) {
            while (number > 0) {
                int digit = number % 10;
                if (digit == 0) {
                    numWords += "Zero ";
                } else if (digit == 1) {
                    numWords += "One ";
                } else if (digit == 2) {
                    numWords += "Two ";
                } else if (digit == 3) {
                    numWords += "Three ";
                } else if (digit == 4) {
                    numWords += "Four ";
                } else if (digit == 5) {
                    numWords += "Five ";
                } else if (digit == 6) {
                    numWords += "Six ";
                } else if (digit == 7) {
                    numWords += "Seven ";
                } else if (digit == 8) {
                    numWords += "Eight ";
                } else if (digit == 9) {
                    numWords += "Nine ";
                }
                number = number / 10;


            }
        }
        for (int counter = num1 - num2; !(counter == 0); counter--) {
            numWords += "Zero ";
        }

        System.out.println(numWords);
    }


    public static int reverse(int number) {
        int reverse = 0;
        if (number > 0) {
            while (number > 0) {
                int digit = number % 10;
                reverse = reverse * 10 + (digit);
                number = number / 10;
            }
        } else if (number < 0) {
            while (number < 0) {
                int digit = number % 10;
                reverse = reverse * 10 + (digit);
                number = number / 10;
            }
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            count += 1;
            number = number / 10;
        }
        if (count == 0 ){
            count +=1;
        }
        return count;
    }

}

