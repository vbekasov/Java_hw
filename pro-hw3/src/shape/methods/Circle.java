package shape.methods;

public class Circle extends Shape implements IPrintable {
    private final int radius;
    public Circle(String name, String radius) {
        super(name);
        this.radius = Integer.parseInt(radius);
    }
    @Override
    public void print() {
        System.out.printf(
                "Name: %s, Area: %f, Perimeter: %f, " +
                        "Radius: %d, Diameter: %d\n",
                getName().toString(),
                Math.PI * Math.pow(radius, 2.),
                Math.PI * radius * 2,
                radius, radius * 2);
    }
}
