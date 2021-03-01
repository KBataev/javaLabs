package by.gsu.pms;

public class Stock{
    private boolean isStock;
    private int price;
    private String name;

    public Stock(boolean isStock, int price, String name) {
        this.isStock = isStock;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" + "isStock=" + isStock + ", price=" + price + ", name='" + name + '\'' + '}';
    }
}
