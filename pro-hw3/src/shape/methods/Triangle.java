package shape.methods;

public class Triangle extends Shape implements IPrintable{
    private final Integer[] sides;
    private final Double[]  angles;

    {
        sides = new Integer[3];
        angles = new Double[3];
    }

    public Triangle(String name, String sides) {
        super(name);
        String[] tmpSides = UtilJsonParser.parseJson(sides);
        this.sides[0] = Integer.parseInt(tmpSides[0]);
        this.sides[1] = Integer.parseInt(tmpSides[1]);
        this.sides[2] = Integer.parseInt(tmpSides[2]);

        if (!isTriangle())
            this.sides[0] = this.sides[1] = this.sides[2] = 0;
        else
            setAngles();
        setAngles();
    }

    private void setAngles() {
        angles[0] = Math.toDegrees(Math.acos(
                (Math.pow(sides[1], 2) + Math.pow(sides[2], 2) -
                Math.pow(sides[0], 2)) / (2 * sides[1] * sides[2])));
        angles[1] = Math.toDegrees(Math.acos(
                (Math.pow(sides[0], 2) + Math.pow(sides[2], 2) -
                        Math.pow(sides[1], 2)) / (2 * sides[0] * sides[2])));
        angles[2] = Math.toDegrees(Math.acos(
                (Math.pow(sides[1], 2) + Math.pow(sides[0], 2) -
                        Math.pow(sides[2], 2)) / (2 * sides[1] * sides[0])));
    }

    private boolean isTriangle() {
        if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0)
            return false;
        if (sides[0] >= (sides[1] + sides[2]))
            return false;
        if (sides[1] >= (sides[2] + sides[0]))
            return false;
        if (sides[2] >= (sides[1] + sides[0]))
            return false;

        return true;
    }

    private int perimeter() {
        return (sides[0] + sides[1] + sides[2]);
    }

    private double area() {
        Double p = perimeter() / 2.;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) *
                (p - sides[2]));
    }

    @Override
    public void print() {

        if (sides[0] == 0) {
            System.out.println("Error Triangle" + "!");
            return ;
        }

        System.out.printf(
                "Name: %s, Area: %f, Perimeter: %d, " +
                        "Side vs angle: %d %f, %d %f, %d %f\n",
                getName().toString(),
                area(), perimeter(),
                sides[0], angles[0],
                sides[1], angles[1],
                sides[2], angles[2]
        );

    }
}
