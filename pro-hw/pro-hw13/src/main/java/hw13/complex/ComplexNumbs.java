package hw13.complex;

public class ComplexNumbs {
    private float r = 0;
    private float i = 0;
    private float m = 0;

    public ComplexNumbs() {}

    public ComplexNumbs(float r, float i) {
        this.r = r;
        this.i = i;
        this.m = (float) Math.sqrt(Math.pow(r, 2) + Math.pow(i, 2));
    }

    private float magnetude()

    public ComplexNumbs(float r) {
        this.r = r;
        this.m = r;
    }

    public static ComplexNumbs sumComplex(ComplexNumbs a, ComplexNumbs b) {
        return new ComplexNumbs(
                a.getR() + b.getR(),
                a.getI() + b.getI());
    }

    public ComplexNumbs conjugate() {
        this.i *= -1;
        return this;
    }

    public ComplexNumbs addNumb(ComplexNumbs c) {
        this.setR(this.r + c.getR());
        this.setI(this.i + c.getI());

        return this;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }
}
