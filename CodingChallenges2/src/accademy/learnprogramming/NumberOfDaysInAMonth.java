package accademy.learnprogramming;

/*Write a method isLeapYear with a parameter of type int named year.

        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

        If the parameter is not in that range return false.

        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.

        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.*/
/*Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

        If parameter month is < 1 or > 12 return -1. ​
        If parameter year is < 1 or > 9999 then return -1.

        This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

        You should check if the year is a leap year using the method isLeapYear described above.*/
public class NumberOfDaysInAMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (month > 12 || month < 1 || year < 1 || year > 9999) {
            return -1;
        } else {
            boolean leap = isLeapYear(year);

            if (month == 2 && leap == true) {
                return 29;
            } else if (month == 2 && leap == false) {
                return 28;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            } else return 30;

        }

    }

}
