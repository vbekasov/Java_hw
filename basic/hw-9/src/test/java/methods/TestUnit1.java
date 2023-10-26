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

        for (int j = 0; j < 100; j++) {
            
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
 