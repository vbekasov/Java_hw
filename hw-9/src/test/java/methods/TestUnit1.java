package methods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUnit1 {
    private int Miss;

    private int[] garbageCollect(int i) {
        OneMissing testObj = new OneMissing(i+2);
        this.Miss = testObj.getMissing();

        return testObj.getArr();
    }

    @Test
    void checkExcluded() {
        int i = 0;
        System.out.println("some text");

        for ( ; i < 100; i++) {
            System.out.println("some text");
            
            int tmp[] = garbageCollect(i+10);

            boolean checkArr[] = new boolean[tmp.length + 2];
            
            for (int b : tmp)
                checkArr[b-1] = true;
            
            i = -1;
            while (checkArr[++i] == true) {}
            i++;
            assertEquals(this.Miss , i, "PASSED");
        }
    }
}
 