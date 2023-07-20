package methods;
// https://upload.wikimedia.org/wikipedia/commons/1/10/Leap_Centuries.jpg

public class LeapYear {
    public static void isLeap(int year) {
        if ((year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

    }
}
