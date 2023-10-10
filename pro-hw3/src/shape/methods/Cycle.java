package shape.methods;

public class Cycle extends Shape implements IPrintable{
    private final int radius;
    public Cycle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
//Название, Площадь, Периметр, Радиус, Диаметр
    @Override
    public void print() {
        System.out.printf(
                "Name : %s; Squire : %d ; Perimeter : %d ; " +
                        "Radius : %d, Diameter : %d",
                getName().toString(), 0, 0, radius, radius * 2
        );
    }
}
