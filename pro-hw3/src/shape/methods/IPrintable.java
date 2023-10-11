package shape.methods;

import java.util.Locale;

public interface IPrintable {
    void print();

    static IPrintable shapeFactory(String uInput) {
        String[] factoryStr = UtilJsonParser.parseJson(uInput);
        return switch (factoryStr[1].toUpperCase(Locale.ROOT)){
            case "CIRCLE" -> new Circle("CIRCLE", factoryStr[3]);
            case "RECTANGLE" -> new Rectangle("RECTANGLE", factoryStr[3]);
            default -> null;
        };
    }
}
