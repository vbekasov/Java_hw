package methods;
import java.util.Scanner;

public class Fun1 {
    private static String fWord;
    private static String sWord;

    private static String splitBeginningsOfWords(String first, String second) {
        String ret = first.substring(0,2) + second.substring(0,2);
        return ret;
    }

    public static String grubText() {
        Scanner Obj = new Scanner(System.in);
        
        System.out.print("First Word : ");
        fWord = Obj.nextLine();
        if (fWord.length() != 4 ) return "Error!!!";

        System.out.print("Second Word : ");
        sWord = Obj.nextLine();
        if (sWord.length() != 4) return "Error!!!";

        Obj = null;

        return splitBeginningsOfWords(fWord, sWord);
    }
}
