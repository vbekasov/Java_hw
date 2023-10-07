package bicycles;

public class Bicycle {
    private String  type;
    private String  producer;
    private String  owner;
    private int     gears;
    private int     price;

    private Bicycle(String type, String producer, String owner, int gears, int price) {
        this.type = type;
        this.producer = producer;
        this.owner = owner;
        this.gears = gears;
        this.price = price;
    }

    public static Bicycle productBecycle(String type, String producer, String owner, int gears, int price) {
        return new Bicycle( type, producer, owner, gears, price);
    }

    @Override
    public String toString() {
        return "=Becycle!'{" +
                "\"type\":\"" + type + '"' +
                ", \"producer\":\"" + producer + '"' +
                ", \"owner\":\"" + owner + '"' +
                ", \"gears\":\"" + gears + '"' +
                ", \"price\":\"" + price + "\"}'!";
    }
}
