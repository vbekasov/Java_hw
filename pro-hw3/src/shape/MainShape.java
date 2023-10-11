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
                        "{'name':'rectangle', 'sides':['2','3']}"),
                IPrintable.shapeFactory(
                        "{'name':'circle','radius':'5'}"),

        };

        for (IPrintable i : shapesArr)
            i.print();

    }
}



/*
        String[] tmp = UtilJsonParser.parseJson(
                "{'name':'rectangle', 'sides':['2','3']}");
        System.out.println(Arrays.toString(tmp));
        //tmp = UtilJsonParser.parseJson(tmp[3]);
        //System.out.println(Arrays.toString(tmp));
        Rectangle rec = new Rectangle("RECTANGLE", tmp[3]);
        rec.print();*/
