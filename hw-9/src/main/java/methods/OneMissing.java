package methods;

import java.util.Arrays;
//import java.util.Random;

public class OneMissing {
    private       int arr[];
    private       int length;
    private       int excluded;
    private final byte bm = -128;
    
    public OneMissing() {
        this.length = 5;
        this.arr = new int[5];
        randomizeArray();
    }

    public OneMissing(int total) {
        this.length = total;
        this.arr = new int[total];
        randomizeArray();
        this.excluded++;
    }

    private void randomizeArray() {
        byte tmp[] = new byte[this.length+1];
        setByteArr(tmp);
        this.excluded = retRand();
        tmp[this.excluded] = -128;
        int tempRand;
        int i = 0;

        for ( ; i < this.length+1; i++) {
            while ((tempRand = retRand()+1) == i) {}
            swapTwoArr(tmp, i, tempRand);
        }
        
        i = 0;
        for( ; i < this.length && tmp[i] != -128; i++) {
            this.arr[i] = tmp[i] + 128;
        }

        for ( ; i < this.length; i++) {
            this.arr[i] = tmp[i+1] + 128;
        }
    }

    private byte[] swapTwoArr(byte tmp[], int first, int second) {
        byte tmpInt = tmp[second];
        tmp[second] = tmp[first];
        tmp[first] = tmpInt;

        return tmp;
    }

    private void setByteArr(byte tmp[]) {
        for (int i = 0; i < this.length+1; i++)
            tmp[i] = (byte)(i-bm+1) ;
    }

    private int retRand() {
        return (int)(Math.random() * (this.length-1));
    }

    public void printArray() {
        System.out.println(Arrays.toString(this.arr));
        System.out.println(this.excluded);
    }

    public int[] getArr() {
        return this.arr;
    }

    public int getMissing() {
        return this.excluded;
    }
}
