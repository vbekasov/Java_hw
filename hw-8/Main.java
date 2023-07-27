import methods.RandomArray;
import methods.RisingArray;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start\n\n---Part One---\n");
        
        RandomArray myArr = new RandomArray();
        myArr.printArray();
        myArr.oddToZero();
        myArr.printArray();

        System.out.println("\n---Part Two--\n");
        RisingArray riseArr = new RisingArray();
        riseArr.printArray();
        riseArr.ifRising();
        System.out.println("---Generate Rising");
        riseArr.generateRising();
        riseArr.printArray();
        riseArr.ifRising();


    }
}
