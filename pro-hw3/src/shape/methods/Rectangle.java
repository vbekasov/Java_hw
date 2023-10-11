package shape.methods;

public class Rectangle extends Shape implements IPrintable{
    private final Integer[] sides;

    {
        sides = new Integer[2];
    }

    public Rectangle(String name, String sides) {
        super(name);
        String[] tmpSides = UtilJsonParser.parseJson(sides);
        this.sides[0] = Integer.parseInt(tmpSides[0]);
        this.sides[1] = Integer.parseInt(tmpSides[1]);

        if (this.sides[0] < this.sides[1]) {
            int tmp = this.sides[0];
            this.sides[0] = this.sides[1];
            this.sides[1] = tmp;
        }
    }

    @Override
    public void print() {
        System.out.printf(
                "Name: %s, Area: %d, Perimeter: %d, " +
                        "Diagonal %f, Long side %d, Short side %d\n",
                getName().toString(),
                sides[0] * sides[1],
                sides[0] * 2 + sides[1] * 2,
                Math.sqrt(Math.pow(sides[0], 2) + Math.pow(sides[1], 2)),
                sides[0], sides[1]);
    }
}
