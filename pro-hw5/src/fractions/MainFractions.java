package fractions;

import fractions.methods.Fraction;

public class MainFractions {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(6, 8);
        Fraction f3 = new Fraction(1, 3);
        Fraction f4 = new Fraction(3, 9);
        Fraction f5 = new Fraction(2, 4);

        System.out.println((f1 == f2) + " " + f1.equals(f2));
        System.out.println(f1.hashCode() == f2.hashCode());
        System.out.println(f1.hashCode());
        System.out.println(17 * f1.numerator() + 19 * f1.denominator());
        System.out.println((f3 == f4) + " " + f3.equals(f4));
        System.out.println((f2 == f5) + " " + f2.equals(f5));
    }
}
