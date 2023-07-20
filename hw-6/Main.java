import methods.BiggestThree;
import methods.LeapYear;
import methods.Shop;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start\n---Part one---");

        Shop firstShop = new Shop(true, true);
        firstShop.printAnswer();
        Shop secondShop = new Shop(false, true);
        secondShop.printAnswer();
        Shop thirdShop = new Shop(false, false);
        thirdShop.printAnswer();

        System.out.println("\n---Part Two---");
        LeapYear.isLeap(2000);
        LeapYear.isLeap(1600);
        LeapYear.isLeap(1800);
        LeapYear.isLeap(2200);
        LeapYear.isLeap(2002);
        LeapYear.isLeap(2001);

        System.out.println("\n---Part Thee---");
        BiggestThree.biggestOfThree();
    }
}