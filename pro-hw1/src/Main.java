import methods.Auto;
import methods.Pair;
import methods.Student;
import methods.defaults.AutoType;
import methods.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Task 1.1---");

        Auto testAuto = new Auto();
        testAuto.type = AutoType.LORRY;
        // no access to horsePower, manufacturer,
        testAuto.setHorsePower(123);
        testAuto.setManufacturer("MAN");
        testAuto.setModel("E321");
        System.out.println(testAuto);

        System.out.println("\n---Task 1.2---");
        Auto[] autoArr = new Auto[3];
        autoArr[0] = Factory.productLorry(
                321,"VOLVO", "MOD09"
        );
        autoArr[1] = Factory.productSedan(
                123, "BMW", "X5"
        );
        autoArr[2] = Factory.productSportsCar(
                231, "Jaguar", "Type E"
        );
        for (Auto it : autoArr) {
            System.out.println(it);
        }

        System.out.println("\n---Task 2---");
        Student person1 = new Student(
                "Ivan", "Ivanov", 3);
        person1.increaseGroup();
        System.out.println(person1.toString());
        Student person2 = new Student(person1);
        System.out.println(person2);
        System.out.printf("Both have same address : %s\n", (person1 == person2));
        person1.setFirstName("John");
        person1.setLastName("Smith");
        person2.increaseGroup();
        System.out.println("Person one was change");
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println("\n---Task 3---");
        Pair firstPair = new Pair();
        Pair secondPair = new Pair("111", "222");
    }
}
