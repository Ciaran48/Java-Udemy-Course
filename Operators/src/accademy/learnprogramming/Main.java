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
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I am afraid of aliens");//prints without a code block
        }
        
    }
}
