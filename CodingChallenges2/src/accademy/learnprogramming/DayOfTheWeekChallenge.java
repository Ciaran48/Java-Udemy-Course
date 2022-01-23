package accademy.learnprogramming;

/*Write a method with the name printDayOfTheWeek that has one parameter type
int and name it day.
The method should not return any value.
use a switch statement to confirm day of the week for example 7 is a sunday,
1 is a monday etc
Bonus do the solution again but using if else.
  */
public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number, try between 1-7");

        }
    }
    public static void printDayOfTheWeekBonus(int day) {

        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2){
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");
        }
        else if (day == 6){
            System.out.println("Saturday");
        }
        else if (day == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid number, try between 1-7");
        }
    }
}
