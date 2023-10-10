package shape;

import shape.methods.Cycle;
import shape.methods.IPrintable;

import java.util.Arrays;

public class MainShape {
    public static void main(String[] args) {
        Cycle tmp = (Cycle) IPrintable.shapeFactory(
                "{'name':'cycle','radius':'3'}");
        tmp.print();
    }
}
