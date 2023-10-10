package shape.methods;

public interface IPrintable {
    public abstract void print();

    public static Shape shapeFactory(String uInput) {
        String[] factoryStr = UtilJsonParser.parseJson(uInput);
        Shape outShape = switch (factoryStr[1].toUpperCase()){
            case "CYCLE" -> new Cycle("CYCLE", Integer.parseInt(factoryStr[3]));
            default -> null;
        };
        return outShape;
    }
}
