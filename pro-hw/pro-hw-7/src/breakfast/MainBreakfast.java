package breakfast;

import breakfast.methods.GranSon;
import breakfast.methods.GrandMom;
import breakfast.methods.Pancake;
import breakfast.methods.Table;

public class MainBreakfast {
    public static void main(String[] args) {
        Table       table = new Table();
        GrandMom    gm = new GrandMom();
        GranSon     gs = new GranSon(7);

        for (int i = 0; i < gs.getAge(); i++) {
            gm.cook(table);
            gs.eat(table);
        }
    }
}
