package lombok.task_one;

import lombok.task_one.methods.Example;

public class MainLombok {
    public static void main(String[] args) {
        Example ex1 = new Example();
        ex1.setId(0);
        ex1.setName("Qwerty");
        System.out.println(ex1);

        Example ex2 = new Example(1, "Abcd");
        System.out.printf("Ex2 - id : %d, name : %s",
                ex2.getId(), ex2.getName());
    }
}
