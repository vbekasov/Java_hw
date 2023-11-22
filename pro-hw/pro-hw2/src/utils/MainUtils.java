package utils;

import java.util.Arrays;

public class MainUtils {
    public static void main(String[] args) {
        System.out.println("---Tas One---\n");

        System.out.println(UtilsStrings.generateWord(100));
        System.out.println(UtilsStrings.generateNumeric(100));
        System.out.println(Arrays.toString(UtilsStrings.splitByFirst("QWE!RTY!UIO")));
        System.out.println(Arrays.toString(UtilsStrings.splitByFirst("QWEotRTYoUIO")));
        System.out.println(Arrays.toString(UtilsStrings.splitByFirst("Люди! Я люблю Java! Ура!")));
        System.out.println(UtilsStrings.isNumeric("123456"));
        System.out.println(UtilsStrings.isNumeric("01234"));
        System.out.println(UtilsStrings.isNumeric("123!2343"));
    }
}
