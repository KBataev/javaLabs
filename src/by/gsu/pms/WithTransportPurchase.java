package by.gsu.pms;

public class WithTransportPurchase extends AbstractPurchase   {
    private float transportPrice;

    public WithTransportPurchase(Commodity commodity, int purchaseNumber, float transportPrice){
        super(commodity, purchaseNumber);
        this.transportPrice = transportPrice;
    }

    public float getTransportPrice() {
        return transportPrice;
    }

    public void setTransportPrice(float transportPrice) {
        this.transportPrice = transportPrice;
    }

    @Override
    public  float getCost(){
        return getPurchaseNumber() * (getCommodity().getPrice() + transportPrice);
    }
}
