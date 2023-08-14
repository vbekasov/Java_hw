package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private int winningNumbs[];
    private int playerNumbs[][];
    private final int lengthArr = 5;
    private final int numbsInLottery = 50;

    public Lottery(int players[][]) {
        winningNumbs = new int[lengthArr];
        playerNumbs = new int[3][lengthArr];
        generateWinningNumbs();
        for (int i = 0; i < 3; i++) {
            setPlayerNumbs(i, players[i]);
        }
    }

    public Lottery() {
        winningNumbs = new int[lengthArr];
        playerNumbs = new int[3][lengthArr];
        generateWinningNumbs();
        setPlayerArray();
    }

    public void generateWinningNumbs() {
        int addNumb;
        for (int i = 0; i < lengthArr; i++) {
            addNumb = (int)(Math.random() * numbsInLottery)+1;
            while (checkInWinning(addNumb)) {
                addNumb = (int)(Math.random() * numbsInLottery)+1;
            }
            winningNumbs[i] = addNumb;
        }
    }

    private boolean checkInWinning(int check) {
        for (int iter: winningNumbs) {
            if (iter == check)
                return true;
            if (iter == 0)
                return false;
        }
        return false;
    }

    private void setPlayerNumbs(int player, int numbs[]) {
        playerNumbs[player] = numbs;
    }

    private void setPlayerArray() {
        int enteredNumb = 0;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter player numbers\n");
        for (int j = 0; j < 3; j++) {
            System.out.println("Player " + (j+1));
            for (int i = 0; i < lengthArr; i++) {
                enteredNumb = 0;
                while (!(1 <= enteredNumb && enteredNumb <= 50)) {
                    System.out.println("Enter number : " + (i + 1));
                    enteredNumb = scanObj.nextInt();
                }
                playerNumbs[j][i] = enteredNumb;
            }
        }
    }

    public void printPlayers() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + (i+1) + " : " + Arrays.toString(playerNumbs[i]));
        }
    }

    public void printWinning() {
        System.out.println("Winning numbers : " + Arrays.toString(winningNumbs));
    }

    private void sortArrs() {
        Arrays.sort(winningNumbs);
        for (int i = 0; i < 3; i++) {
            Arrays.sort(playerNumbs[i]);
        }
    }

    public void startLottery() {
        sortArrs();
        printPlayers();
        printWinning();

        int winArr[];
        for (int i = 0; i < 3; i++) {
            winArr = checkPlayerWin(i);
            if (winArr != null)
                System.out.println("Player " + (i+1) + " won with numbers : " + Arrays.toString(winArr));
            else
                System.out.println("Player " + (i+1) + " lose");
        }
    }

    public void printWinner() {
        System.out.println("In progress");
    }

    public int[][] getWinsAndPlayNumbs () {
        int arr[][] = new int[4][5];
        arr[0] = winningNumbs;
        for (int i = 0; i < 3; i++) {
            arr[i+1] = playerNumbs[i];
        }

        return arr;
    }

    private int[] checkPlayerWin(int playerNr) {
        int winMod = 0;
        int playerMod = 0;
        int match[] = new int[6];
        int totalMatch = 0;

        while (winMod < lengthArr && playerMod < lengthArr) {
            if (winningNumbs[winMod] != playerNumbs[playerNr][playerMod]) {
                if (winningNumbs[winMod] > playerNumbs[playerNr][playerMod])
                    playerMod++;
                else
                    winMod++;
            }
            else {
                winMod++; playerMod++;
                match[totalMatch] = winningNumbs[winMod];
                totalMatch++;
            }
        }

        if (totalMatch < 2)
            return null;
        else {
            match[5] = totalMatch;
            return  match;
        }
    }
}
