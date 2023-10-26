package methods;

import java.util.Scanner;

public class BankAccount {
    private int funds;
    private int iterations;

    public BankAccount() {
        this.iterations = 0;
        System.out.print("Enter remaining amount : ");
        Scanner myScanner = new Scanner(System.in);
        this.funds = Integer.parseInt(myScanner.nextLine());
        //myScanner.close();
    }

    public void moneyLeft() {
        if (this.funds < 0) {
            System.out.println("Less 0");
            return ;
        }

        int     i = 0;
        boolean loopOut;
        double  amountSqrt;

        while (this.funds > 3) {
            loopOut = true;
            amountSqrt = Math.sqrt(this.funds);

            for (i = 2; loopOut && i <= amountSqrt; i++) {
                if (this.funds % i == 0)
                    loopOut = false;
            }

            if (loopOut == false) {
                i--;
                this.funds = this.funds - (this.funds / i);
            }
            else {
                this.funds--;
            }
            this.iterations++;
        }
        this.iterations += this.funds;
        System.out.println("Out : " + this.iterations);
    }
}
