package methods;

import java.util.ArrayList;

public class SQLParser {
    private ArrayList<Object> inQuery;
    private StringBuilder outputQuery;

    public SQLParser(ArrayList<Object> input) {
        inQuery = input;

    }

    public void setQuery (ArrayList<Object> input) {
        inQuery = input;
    }

    public void printQuery () {
        for (Object object : inQuery) {
            if (object != null)
                System.out.print(object.toString() + " | ");
            else
                System.out.print("null tran" + " | ");
        }
        System.out.println();
    }

    public StringBuilder parseSQL() {
        outputQuery = new StringBuilder("SELECT * FROM cars WHERE");
        int lan = inQuery.size();

        for (int i = 1; i < lan; i+= 2) {
            if ((inQuery.get(i)) != null){
                if (inQuery.get(i) instanceof String ||
                    inQuery.get(i) instanceof Character)
                    outputQuery.append(" " + inQuery.get(i-1) + "='" + inQuery.get(i) + "' AND");
                else
                    outputQuery.append(" " + inQuery.get(i-1) + "=" + inQuery.get(i) + " AND");
            }
        }

        lan = outputQuery.length();
        if (outputQuery.charAt(lan-1) == 'D') {
            outputQuery.delete(lan-5, lan);
        }
        outputQuery.append(';');
        
        return outputQuery;
    }
}
