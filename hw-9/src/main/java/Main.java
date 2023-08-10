import java.util.ArrayList;

import methods.OneMissing;
import methods.SQLParser;

public class Main {
    public static void main(String[] args) {
        System.out.println("HW-9\n\n---Part One---\n");

        OneMissing testObj = new OneMissing(30);
        testObj.printArray();
        int miss = testObj.getMissing();
        int tmpArr[] = testObj.getArr();
        boolean checkArr[] = new boolean[tmpArr.length + 2];
        int i = -1;

        for (int b : tmpArr)
            checkArr[b-1] = true;
            
           i = -1;
           while (checkArr[++i] == true) {}
           i++;
        System.out.println("Expected : " + miss + " | Actual : " + i);


        System.out.println("\n---Part Two---");

        ArrayList<Object> nObj = new ArrayList<Object>();
        nObj.add("id"); nObj.add(123);
        nObj.add("first"); nObj.add(null);
        nObj.add("second"); nObj.add("text");
        nObj.add("third"); nObj.add('T');
        SQLParser nSql = new SQLParser(nObj);
        nSql.printQuery();
        System.out.println(nSql.parseSQL().toString());

        nObj.clear();
        nObj.add("id"); nObj.add(null);
        nObj.add("first"); nObj.add(null);
        nObj.add("second"); nObj.add(null);
        nSql.setQuery(nObj);
        nSql.printQuery();
        System.out.println(nSql.parseSQL().toString());
    }
}
