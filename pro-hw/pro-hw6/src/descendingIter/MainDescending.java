package descendingIter;

import descendingIter.customIter.CustomIter;

import java.util.ArrayList;
import java.util.List;

public class MainDescending {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        iList.add(324);
        iList.add(74);
        iList.add(6334);
        iList.add(965);
        iList.add(26);

        CustomIter<Integer> it = (CustomIter<Integer>) iList.iterator();
    }
}
