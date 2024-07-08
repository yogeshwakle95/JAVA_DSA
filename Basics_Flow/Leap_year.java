package JAVA_DSA.Basics_Flow;

//  Input a year and find whether it is a leap year or not.
public class Leap_year {
    public static void main(String[] args) {

        // year to be checked;
        int year = 1990;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
                leap = true;
            } else {
                leap = false;
            }
            leap = true;
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println(year + " year is leap");
        } else {
            System.out.println(year + " year not a leap");
        }
    }
}