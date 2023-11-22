package shape.methods;

public class Cube extends Shape implements IPrintable{
    private final Integer side;

    public Cube(String name, String side) {
        super(name);
        this.side = Integer.parseInt(side);
    }

    private Double diagonal() {
        return Math.sqrt(Math.pow(Math.sqrt(2 * Math.pow(side, 2)), 2) +
                Math.pow(side, 2));
    }

    @Override
    public void print() {
        if (side <= 0) {
            System.out.println("Error Cube!");
            return ;
        }

        System.out.printf(
                "Name: %s, Area: %f, Value: %f, " +
                        "Diagonal %f, Side %d\n",
                getName().toString(), 6 * Math.pow(side, 2),
                Math.pow(side, 3), diagonal(), side);
    }
}
