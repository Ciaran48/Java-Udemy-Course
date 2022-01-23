package accademy.learnprogramming;

import static accademy.learnprogramming.AreaCalculator.area;
import static accademy.learnprogramming.BarkingDog.shouldWakeUp;
import static accademy.learnprogramming.DecimalComparator.areEqualByThreeDecimalPlaces;
import static accademy.learnprogramming.EqualSumChecker.hasEqualSum;
import static accademy.learnprogramming.LeapYearCalculator.isLeapYear;
import static accademy.learnprogramming.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static accademy.learnprogramming.SecondsAndMinutesChallenge.getDurationString;
import static accademy.learnprogramming.SpeedConverter.printConversion;
import static accademy.learnprogramming.SpeedConverter.toMilesPerHour;
import static accademy.learnprogramming.TeenNumberChecker.hasTeen;
import static accademy.learnprogramming.TeenNumberChecker.isTeen;

public class Main {

    public static void main(String[] args) {

        /*Example
        checkNumber(1);
        checkNumber(-1);
        checkNumber(0);*/

        /*SpeedConverter
        toMilesPerHour(1.25);
        printConversion(1.25);*/

        /*MegabyteConverter
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);*/

        /*DogBarkingChallenge
        shouldWakeUp(true, 22);
        shouldWakeUp(false, 22);*/

        /*LeapYearCalculator
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2017));*/

        //DecimalComparator
        //System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

        //EqualSumChecker
        //System.out.println(hasEqualSum(1, -1, 0));

       /* System.out.println(isTeen(16));
        System.out.println(isTeen(20));
        System.out.println(hasTeen(22, 16, 20));
        System.out.println(hasTeen(22, 20, 20));*/

        /* SecondsAndMinutesChallenge
        getDurationString(77, 9);
        getDurationString(77);*/

       /* AreaCalculator
       System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));*/


    }



}
