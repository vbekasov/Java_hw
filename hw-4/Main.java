import java.util.Random;

import methods.CalcTwo;
import methods.SolveWords;

public class Main {
    private static float[] retTwoRand() {
        float ret[] = new float[2];
        Random rand = new Random();
        ret[0] = rand.nextFloat();
        ret[1] = rand.nextFloat();
        return ret;
    }
    public static void main(String[] args) {
        System.out.println("---Part One---\n");

        SolveWords.printTwoSplits();

        System.out.println("\n---Part Two---\n");

        float twoNums[] = new float[2];
        twoNums = retTwoRand();
        System.out.println(CalcTwo.twoSum(twoNums[0], twoNums[1]));
        twoNums = retTwoRand();
        System.out.println(CalcTwo.twoSub(twoNums[0], twoNums[1]));
        twoNums = retTwoRand();
        System.out.println(CalcTwo.twoMul(twoNums[0], twoNums[1]));
        twoNums = retTwoRand();
        System.out.println(CalcTwo.twoDiv(twoNums[0], twoNums[1]));
    }
    
}