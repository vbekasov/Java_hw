package methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LotteryJUNIT {

    private static boolean checkExist(int arr[], int check) {
        for (int iter: arr) {
            if (iter == check)
                return true;
            if (iter == 0)
                return false;
        }
        return false;
    }
    private static int[] randFive() {
        int retNumb[] = new int[5];
        int lengthArr = 5;
        int numbsInLottery = 50;
        int addNumb;
        for (int i = 0; i < lengthArr; i++) {
            addNumb = (int)(Math.random() * numbsInLottery)+1;
            while (checkExist(retNumb, addNumb)) {
                addNumb = (int)(Math.random() * numbsInLottery)+1;
            }
            retNumb[i] = addNumb;
        }

        return retNumb;
    }

    private int[][] generateThreePlayers() {
        int players[][] =  {randFive(), randFive(), randFive()};
        return players;
    }

    private boolean checkDups(int arr[][]) {
        for (int[] it: arr) {
            for (int i = 0; i < 4; i++) {
                if (it[i] == it[i+1])
                    return true;
            }
        }

        return false;
    }

    private boolean testConstruction() {
        Lottery myLot = new Lottery(generateThreePlayers());
        myLot.startLottery();
        //System.out.println("---New Test---");

        return !checkDups(myLot.getWinsAndPlayNumbs());
    }

    @Test
    void testWinandPlayNumbs () {
        for (int i = 0; i < 100; i++) {
            assertEquals(true, testConstruction());
        }
    }
}
