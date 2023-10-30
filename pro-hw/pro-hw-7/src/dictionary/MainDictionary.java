package dictionary;

import dictionary.methods.DictionaryFromCSV;

public class MainDictionary {
    public static void main(String[] args) {
        System.out.println("Works");

        DictionaryFromCSV dictionary = new DictionaryFromCSV();
        dictionary.startTranslate();
    }
}
