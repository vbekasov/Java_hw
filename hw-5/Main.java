import methods.TaskOneCompare;
import methods.TaskTwoTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start\n\n---Task One--\n");

        TaskOneCompare.compareNums();

        System.out.println("\n---Task Two--\n");

        TaskTwoTime.secToHour();
    }
}
