package by.gsu.pms;

public class DiscountPurchase extends AbstractPurchase{
    private  float discount;

    public DiscountPurchase(Commodity commodity, int purchaseNumber, float discount) {
        super(commodity, purchaseNumber);
        this.discount = discount;
    }
    @Override
    public float getCost(){
        return (getCommodity().getPrice() - discount) * getPurchaseNumber();
    }
}


