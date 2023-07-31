import by.gsu.pms.*;
import java.util.Arrays;


public class Runner {
    public static void main(String[] args) {
        Commodity commodity = new Commodity("sweets", (int) 30);
        AbstractPurchase[] arr = {
                new DiscountPurchase(commodity, 13, 12),
                new DiscountPurchase(commodity, 23, 3),
                new PercentDiscountPurchase(commodity, 50, 10),
                new PercentDiscountPurchase(commodity, 123, 23),
                new WithTransportPurchase(commodity, 23, 25),
                new WithTransportPurchase(commodity, 3, 12)
        };

        IPurchase.print(arr);
        Arrays.sort(arr);
        IPurchase.print(arr);
    }

        private interface IPurchase {
            static void print(AbstractPurchase[] arr) {
                for (AbstractPurchase purchase: arr) {
                    System.out.println(purchase.toString());
                }
            }
        }
    }

