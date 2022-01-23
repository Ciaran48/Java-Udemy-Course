package accademy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1){
            System.out.println("The Value is " + value);
        } else if (value ==2 ){
            System.out.println("The Value is " + value);
        }else if (value == 3){
            System.out.println("The Value is " + value);
        }

        //If Statement is more flexible
        //Switch Statement, good for testing the same variable

        int switchValue = 5;

        switch(switchValue){
            case 1:
                System.out.println("The Value is " + switchValue);
                break;
            case 2:
                System.out.println("The Value is " + switchValue);
                break;
            case 3: case 4: case 5:
                System.out.println("The Value is " + switchValue);
                break;
            //else
            default:
                System.out.println("Not 1, 2, 3, 4, 5");
                break;
        }

        //Challenge
        char character = 'B';
        switch(character){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Thats one of the characters we wanted " + character);
                break;

            default:
                System.out.println("We're looking fo A,B.C,D or E not " + character);
                break;
        }

        String Month = "ApRiL";
        switch(Month.toLowerCase()){
            case "january":
                System.out.println("It's the first month of the year");
                break;
            case "february":
                System.out.println("It's the Second month of the year");
                break;
            case "march":
                System.out.println("It's the third month of the year");
                break;

            default:
                System.out.println("You should know what month it is by now...");
        }
    }
}
