package methods;

import java.util.Scanner;

public class Device {
    public static boolean workDevice(){
        int temperature1;
        int temperature2;
        Scanner scanObj = new Scanner(System.in);
        
        System.out.print("First temp    : ");
        temperature1 = Integer.parseInt(scanObj.nextLine());
        System.out.print("Second temp   : ");
        temperature2 = Integer.parseInt(scanObj.nextLine());
        //scanObj.close();

        if (temperature1 > 100 && temperature2 < 100)
            return true;
        else
            return false;
    }
}
