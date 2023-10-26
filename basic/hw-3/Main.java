import methods.Fun1;
import methods.Fun2;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---Part One---\n");
        
        String str = new String("I study Basic Java!");
        Fun1.taskOne(str);

        System.out.println("\n---Part Two---\n");
        System.out.println(Fun2.twoSum(3.43f, 74.423f));
        System.out.println(Fun2.twoSup(3.43f, 74.423f));
        System.out.println(Fun2.twoMul(3.43f, 74.423f));
        System.out.println(Fun2.twoDiv(3.43f, 74.423f));
    }
}