package methods;

public class Fun1 {
    public static void taskOne(String str) {
        System.out.println(str.charAt(str.length() - 1));
        
        if (str.contains("Java")) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        int javaPos = str.indexOf("Java");
        System.out.println(str.substring(javaPos, javaPos + 4));
    }
}
