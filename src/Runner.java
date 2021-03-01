import by.gsu.pms.Stock;
import by.gsu.pms.StockNameComparator;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Stock[] stockList = {
                new Stock(true, 29, "headphones"),
                new Stock(false, 39, "mouse"),
                new Stock(false, 46, "keyboard"),
                new Stock(false, 29, "screen"),
                null,
                new Stock(true, 98, "speaker"),
                new Stock(true, 158, "printer"),
                new Stock(true, 29, "smart clock"),
                new Stock(false, 29, "Charger"),
                new Stock(true, 29, "fan"),
        };
        for (int i = 0; i < stockList.length; i++) {
            if (stockList[i] != null) {
                System.out.println(stockList[i]);
            } else {
                System.out.println("Empty stock");
            }
        }

        int availabilityProduct = 0;
        for (int i = 0; i < stockList.length; i++){
            if (stockList[i] != null && stockList[i].isStock()) {
                availabilityProduct++;
            }
        }
        System.out.println("Availability product on stock - " + availabilityProduct);

        int commonPrice = 0;
        for (int i = 0; i < stockList.length; i++){
            if(stockList[i] != null ){
                commonPrice += stockList[i].getPrice();
            }
        }

        System.out.println("common price is - " + commonPrice);

        Arrays.sort(stockList, new StockNameComparator());
        System.out.println("Sorted by name:");
        printStocks(stockList);
    }

    private static void printStocks(Stock[] stocks){
        for (Stock stock : stocks){
            System.out.println(stock);
        }
    }
}
