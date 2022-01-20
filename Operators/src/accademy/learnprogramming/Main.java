package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Operators,
        //Used to perform operations
        //Operand, objects manipulated by and operator
        //5+10 (5 and 10 are the operands)
        //Expressions,forming and combining variables, literals
        //5+10 = an expression

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("The previous result " + result);
        result = previousResult;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        //remainder, how many times does three go into 4 remainder
        result = result % 3;
        System.out.println(result);

        //abbreviate
        result++; //1+1
        System.out.println(result);

        result--; // 2-1
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        //if then statement, execute code if
        //conditional statement
        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
            System.out.println("I am afraid of aliens");//prints without a code block

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        //Logical and OR operators
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        //assignment vs equal to operators
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("New Value is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }


        //Ternary Operator,
        //shortcut to assign value to variable
        //3 operands
        // if is car is true, set was car to true or else set it to false
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("WasCar is true");
        }

        //Summary challenge
        //create a double with value 20.00 and 80.00
        //add both numbers together and multiply by 100
        //remainder of the result and 40
        //create a boolean that's true if remainder 0 else false
        //output the boolean
        //write an if statement

        double num1 = 20.00;
        double num2 = 80.00;
        double num3 = (num1 + num2) * 100.00;
        System.out.println(num3);
        double remainder = num3 % 40.00;
        System.out.println(remainder);

        boolean isRemainderZero;

        if (remainder == 0){
            isRemainderZero = true;
            System.out.println(isRemainderZero);
        }else{
            isRemainderZero = false;
            System.out.println(isRemainderZero);}


    }
}
