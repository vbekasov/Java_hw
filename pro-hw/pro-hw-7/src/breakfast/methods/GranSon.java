package breakfast.methods;

public class GranSon {
    private int       age;
    private final int EAT = 1;

    public GranSon(int age) {
        this.age = age;
    }

    public void eat(Table table) {
        table.removeCake(EAT);
    }

    public int getAge() {
        return age;
    }
}
