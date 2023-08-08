package methods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUnit1 {

    @Test
    void checkExcluded() {
        int i = 0;

        for ( ; i < 50; i++) {
            OneMissing testObj = new OneMissing(i+2);
            int tmp[] = testObj.getArr();

            boolean checkArr[] = new boolean[tmp.length + 2];
            
            for (int b : tmp)
                checkArr[b-1] = true;
            
            i = -1;
            while (checkArr[++i] == true) {}
            i++;
            assertEquals(testObj.getMissing(), i, "PASSED");

            tmp = null;
            testObj = null;
        }
    }
}
 