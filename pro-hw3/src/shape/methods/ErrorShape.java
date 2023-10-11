package shape.methods;

public class ErrorShape extends Shape implements IPrintable{
    ErrorShape() {
        super("ERROR");
    }

    @Override
    public void print() {
        System.out.println("Error input");
    }
}
