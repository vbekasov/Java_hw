package shape.methods;

import java.util.Locale;

public class Shape {
    final ShapesList name;

    Shape(String name) {
        name = name.toUpperCase(Locale.ROOT);
        this.name = ShapesList.valueOf(name);
    }

    public ShapesList getName() {
        return name;
    }
}
