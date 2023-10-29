package breakfast.methods;

public class Pancake {
    private final int   Id;
    private static int  maxId = 0;

    public Pancake() {
        Id = maxId++;
    }

    public int getId() {
        return Id;
    }

    public static int getMaxId() {
        return maxId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pancake pancake = (Pancake) o;

        return getId() == pancake.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Pancake{" +
                "Id=" + Id +
                '}';
    }
}
