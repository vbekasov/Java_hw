import methods.BankAccount;
import methods.Device;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start\n\n---Part One---");

        System.out.println("Device temperature");
        System.out.println("Device status : " + Device.workDevice());

        System.out.println("\n---Part Two---");
        BankAccount myBank = new BankAccount();
        myBank.moneyLeft();
    }
}