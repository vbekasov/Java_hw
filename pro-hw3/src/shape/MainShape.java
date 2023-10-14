package shape;

import shape.methods.IPrintable;
public class MainShape {
    public static void main(String[] args) {
        IPrintable[] shapesArr = {
                IPrintable.shapeFactory("rrrrr"),
                IPrintable.shapeFactory(""),
                IPrintable.shapeFactory("{'name':'wrong','r':'3'}"),
                IPrintable.shapeFactory(
                        "{'name':'circle','r':'3'}"),
                IPrintable.shapeFactory(
                        "{'name':'rectangle','sides':['2','3']}"),
                IPrintable.shapeFactory(
                        "{'name':'circle','radius':'5'}"),
                IPrintable.shapeFactory(
                        "{'name':'triangle','sides':['3','4','5']}"),
                IPrintable.shapeFactory(
                        "{'name':'triangle','sides':['5','3','40']}"),
                IPrintable.shapeFactory(
                        "{'name':'cube','sides':'3'}")
        };

        for (IPrintable i : shapesArr)
            i.print();
    }
}
