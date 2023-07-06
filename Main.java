public class Main {
    static void supThree(int int_var) {
        if (int_var >= 10){
            supThree(int_var / 10);
        }
        System.out.print(int_var % 10 + ", ");
    }

    static void threeNum(int int_var) {
        System.out.print("Number " + int_var + " -> ");

        supThree(int_var / 10);
        
        System.out.print(int_var % 10 + "\n ");
    }

    public static void main(String[] args) {
        char ch = 'G';
        int int_num = 89;
        byte byte_var = 4;
        short short_var = 56;
        float float_var = 4.7333436f;
        double double_var = 4.355453532;
        long long_var = 12121;

        Character Char_var = 'G';
        Integer Int_var = 89;
        Byte Byte_var = 4;
        Short Short_var = 56;
        Float Float_var = 4.7333436F;
        Double Double_var = 4.355453532;
        Long Long_var = 12121L;

        System.out.println("---Part one---\n");
        System.out.println("char: " + ch);
        System.out.println("int : " + int_num);
        System.out.println("byte : " + byte_var);
        System.out.println("short : " + short_var);
        System.out.println("float: " + float_var);
        System.out.println("double: " + double_var);
        System.out.println("long: " + long_var);

        System.out.println("\nCharacter: " + Char_var);
        System.out.println("Integer: " + Int_var);
        System.out.println("Byte: " + Byte_var);
        System.out.println("Short: " + Short_var);
        System.out.println("Float: " + Float_var);
        System.out.println("Double: " + Double_var);
        System.out.println("Long: " + Long_var);

        System.out.println("\n---Part two---\n");
        threeNum(345);
        System.out.println();
    }

}
