package by.gsu.pms;
import java.util.Comparator;

public class StockNameComparator implements  Comparator<Stock> {
    @Override
    public int compare (Stock stock1, Stock stock2){
        if(stock1 == stock2){
            return 0;
        }
        if (stock1 == null){
            return 1;
        }
        if(stock2 == null){
            return -1;
        }
    return  stock1.getName().compareTo(stock2.getName());
    }
}
