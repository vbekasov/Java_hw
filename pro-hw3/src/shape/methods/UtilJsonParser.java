package shape.methods;

import java.util.ArrayList;

public class UtilJsonParser {

    private UtilJsonParser() {}

    public static String[] parseJson(final String str) {
        if (str == null || str.isEmpty())
            return null;

        char[] inStr = str.toCharArray();
        ArrayList<String> strArr = new ArrayList<>();
        StringBuilder strBuf = new StringBuilder(str.length());

        int     j;
        for (int i = 0; i < str.length(); i++) {
            if (inStr[i] == '\'' || inStr[i] == '[') {
                strBuf.delete(0, strBuf.length());
                for (j = 0; inStr[j+i+1] != ((inStr[i] == '\'') ? '\'' : ']')
                        ; j++)
                    strBuf.append(inStr[j+i+1]);

                i = j+i+1;
                strArr.add(strBuf.toString());
            }
        }

        String[] strOut = new String[strArr.size()];
        for (j = 0; j < strArr.size(); j++)
            strOut[j] = strArr.get(j);
        return strOut;
    }

}
