package rows.methods;

import java.util.*;

public class InfiniteInput {
    private final ArrayList<String> userInput;
    private final String iQuit = "quit";

    public InfiniteInput() {
        userInput = new ArrayList<>();
    }

    public void startInput() {
        Scanner myScn = new Scanner(System.in);
        boolean bout = true;

        do {
            System.out.print("Please, enter your text :");
            String myStr = myScn.nextLine();
            if (myStr.equals(iQuit))
                bout = false;
            else
                userInput.add(myStr);
        } while (bout);
        System.out.println("Enter is finished\n");

        for (String i: userInput) {
            System.out.println(i);
        }
    }

    public String getLongest() {
        if (userInput.isEmpty())
            return null;

        String str = "";

        for (String i : userInput) {
            if (i.length() > str.length())
                str = i;
        }

        return str;
    }

    public String getShortest() {
        if (userInput.isEmpty())
            return null;

        String str = userInput.getFirst();

        for (int i = 1; i < userInput.size(); i++)
            if (userInput.get(i).length() < str.length())
                str = userInput.get(i);

        return str;
    }
}
