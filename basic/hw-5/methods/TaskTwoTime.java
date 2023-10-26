package methods;

import java.util.Random;

public class TaskTwoTime {
    public static void secToHour() {
        Random randObj = new Random();
        int secTime = randObj.nextInt(28801);

        System.out.println(secTime + " Seconds Remaining");
        System.out.println((secTime / (60 * 60)) + " Hours Remaining");
    }
}
