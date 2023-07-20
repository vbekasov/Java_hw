package methods;

public class Shop {
    private boolean isEdekaOpen;
    private boolean isReweOpen;

    public Shop(boolean isEdeka, boolean isRewe) {
        this.isEdekaOpen = isEdeka;
        this.isReweOpen  = isRewe;
    }

    public boolean canBuy(){
        return (isEdekaOpen || isReweOpen) ? true : false;
    }

    public void printAnswer() {
        System.out.println("I can buy food, and it is " + this.canBuy());
    }
}
