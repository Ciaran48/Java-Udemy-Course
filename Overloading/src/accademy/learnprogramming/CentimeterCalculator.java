package accademy.learnprogramming;
// Create a method called calcFeetAndInchesToCentimeters
// It needs to have two parameters.
// feet is the first parameter, inches is the 2nd parameter
//
// You should validate that the first parameter feet is >= 0
// You should validate that the 2nd parameter inches is >=0 and <=12
// return -1 from the method if either of the above is not true
//
// If the parameters are valid, then calculate how many centimetres
// comprise the feet and inches passed to this method and return
// that value.
//
// Create a 2nd method of the same name but with only one parameter
// inches is the parameter
// validate that its >=0
// return -1 if it is not true
// But if its valid, then calculate how many feet are in the inches
// and then here is the tricky part
// call the other overloaded method passing the correct feet and inches
// calculated so that it can calculate correctly.
// hints: Use double for your number datatypes is probably a good idea
// 1 inch = 2.54cm  and one foot = 12 inches
// use the link I give you to confirm your code is calculating correctly.
// Calling another overloaded method just requires you to use the
// right number of parameters.
public class CentimeterCalculator {
    // 1 inch = 2.54cm
    //1 feet = 30.48cm
    public static double calcFeetAndInchesToCentiMeters(double feet, double inches) {
        if (feet <= 0) {
            return -1;
        } else if (inches <= 0 && inches >= 12) {
            return -1;
        } else {
            feet += (inches /12);
            double conversion = feet * 30.48;
            System.out.println(conversion);
            return conversion;
        }

    }
    public static double calcFeetAndInchesToCentiMeters(double inches) {
        if (inches <= 0 && inches >= 12) {
            return -1;
        } else {
            double feet = (inches / 12);
            inches = inches % feet;
            System.out.println(calcFeetAndInchesToCentiMeters(feet, inches));
            return calcFeetAndInchesToCentiMeters(feet, inches);
        }

    }
}
