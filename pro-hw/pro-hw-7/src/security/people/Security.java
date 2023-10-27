package security.people;

import java.util.LinkedList;
import java.util.Queue;

public class Security extends Person{
    private Queue<Person> row;

    public Security(String name, int age, Queue<Person> row) {
        super(name, age);
        this.row = new LinkedList<>(row);
    }

    public Queue<Person> getRow() {
        return row;
    }

    public void setRow(Queue<Person> row) {
        this.row = row;
    }

    public Queue<Person> passOrKick() {
        if (row == null || row.isEmpty())
            return null;

        Queue<Person> rOut = new LinkedList<>();
        while (!row.isEmpty()) {
            if (row.peek().getAge() >= 21) {
                rOut.add(row.peek());
                row.poll();
            } else
                row.poll();
        }

        row = rOut;
        return rOut;
    }
}
