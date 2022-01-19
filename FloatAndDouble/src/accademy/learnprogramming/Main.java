package accademy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //Float and double are useful for precise calculations
        //double has more range and precision than the float

        //Float,
        //32 bits - 4 bytes
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float is " + myMinFloatValue);
        System.out.println("Maximum Float is " + myMaxFloatValue);

        //Double,
        //64 bits - 8 bytes
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double is " + myMinDoubleValue);
        System.out.println("Maximum Double is " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        //default is a double
        float myFloatValue = 5f /3;
        double myDoubleValue = 5.00d /3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Challenge
        //Convert Pounds to kg
        //1 pound is equal to 0.45359237
        double pounds = 10;
        double conversionRate = 0.45359237;
        double kg =  pounds * conversionRate;
        System.out.println( pounds +" pound is "+kg+"kg") ;

    }
}
