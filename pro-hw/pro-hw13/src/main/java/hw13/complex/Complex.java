package hw13.complex;

public record Complex(float r, float i) {
    public float magnitude() {
        return (float) Math.sqrt(Math.pow(r, 2) + Math.pow(i, 2));
    }

    @Override
    public String toString() {
        return "Complex{" +
                "r=" + r +
                ", i=" + i +
                ", m=" + magnitude() +
                '}';
    }
}
