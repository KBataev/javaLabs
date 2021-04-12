package by.gsu.pms;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase> {
    private Commodity commodity;
    private int purchaseNumber;

    public AbstractPurchase() {
    }

    public AbstractPurchase(Commodity commodity, int purchaseNumber) {
        this.commodity = commodity;
        this.purchaseNumber = purchaseNumber;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(int purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }
    public float getCost(){
        return commodity.getPrice() * purchaseNumber;
    }
    @Override
    public  String toString(){
        return commodity.toString() + ';' + purchaseNumber + ';' +getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return (int)(purchase.getCost() - this.getCost());
    }

}
