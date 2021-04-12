package by.gsu.pms;

public class PercentDiscountPurchase extends AbstractPurchase{
    private float discountPercent;

    public  PercentDiscountPurchase(Commodity commodity, int purchaseNumber, float discountPercent){
        super(commodity, purchaseNumber);
        this.discountPercent = discountPercent;
    }

    public float getDiscountPercent(){
        return discountPercent;
    }

    public void setDiscountPercent(float discountPercent){
        this.discountPercent = discountPercent;
    }
    @Override
    public float getCost(){
        return getCommodity().getPrice() * getPurchaseNumber() * (1 - discountPercent/100);
    }
}
