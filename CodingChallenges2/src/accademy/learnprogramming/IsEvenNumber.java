package accademy.learnprogramming;
/* IsEvenNumberChallenge
create a method called isEvenNumber that takes a parameter of the type int
It's purpose is to determine if the argument passed to the method is
an even number or not.
return true if an even number, otherwise return false.


 */
public class IsEvenNumber {

    public static boolean isEvenNumber(int num){
        if (num % 2 ==0){
            return true;
        }
        else {
            return false;
        }
    }
}
