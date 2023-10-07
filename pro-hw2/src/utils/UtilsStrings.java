/*  1 уровень сложности: №1
Создайте утилитарный класс, который будет хранить полезные методы работы со строками.
 В нём будет один приватный конструктор по умолчанию, а также только статические методы:

generateWord – генерирует строку заданной длины, состоящую только из букв английского алфавита
generateNumeric – генерирует строку заданной длины, состоящую из цифр
splitByFirst – находит в строке первый символ, который не является буквой или цифрой и разделяет строку на части,
 используя найденный символ в качестве разделителя.
  Например, splitByFirst(“Я люблю Java!”) вернёт массив строк [“Я”, “люблю”, “Java!”],
   а splitByFirst(“Люди! Я люблю Java! Ура!”) вернёт массив строк [“Люди”, “ Я люблю Java”, “ Ура”, “”]
isNumeric – проверяет, состоит ли данная строка только из цифр
 (может быть распознана как целое неотрицательное число)
Используйте все методы в коде метода main.
*/


package utils;

import java.util.Random;

public class UtilsStrings {
    private UtilsStrings() {}

    static public String generateWord(int strLength) {
        Random rand = new Random();
        if (strLength < 1)
            return "";

        StringBuilder myStr = new StringBuilder(strLength);
        byte tmp;

        for (int i = 0; i < strLength; i++) {
            tmp = (byte) (rand.nextInt(58) + 65);
            while (!((tmp >= 65 && tmp <= 90) || (tmp >= 97 && tmp <= 122)))
                tmp = (byte) (rand.nextInt(58) + 65);

            myStr.append((char)tmp);
        }

        return myStr.toString();
    }

    static public String generateNumeric(int stringLength) {
        Random rand = new Random();
        StringBuilder myStr = new StringBuilder(stringLength);

        for (int i = 0; i < stringLength; i++) {
            myStr.append(rand.nextInt(10));
        }

        return myStr.toString();
    }

    static public String[] splitByFirst(String inputStr) {
        if (inputStr.isEmpty())
            return null;

        int i = 0;
        int len = inputStr.length() - 1;
        char tmp = inputStr.charAt(0);

        while ((Character.isAlphabetic(tmp) || Character.isDigit(tmp)) && i++ < len)
            tmp = inputStr.charAt(i);

        if (Character.isAlphabetic(tmp) || Character.isDigit(tmp)) {
            String[] outStr = {inputStr};
            return outStr;
        }
        else
            return inputStr.split(Character.toString(tmp));
    }

    static public boolean isNumeric(String inputStr) {
        if (inputStr.isEmpty())
            return false;

        if ((Character.compare(inputStr.charAt(0), '0') == 0))
            return false;

        for (Character tmp: inputStr.toCharArray())
            if (!Character.isDigit(tmp))
                return false;

        return true;
    }
}
