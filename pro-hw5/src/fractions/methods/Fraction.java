package fractions.methods;

public record Fraction(int numerator, int denominator) {

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;

        Fraction tmp = (Fraction) o;

        return ((double) numerator() / (double) denominator()) ==
                ((double) tmp.numerator() / (double) tmp.denominator());
    }

    @Override
    public int hashCode() {
        return 17 * numerator() + 19 * denominator();
    }
}
