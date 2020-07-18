package by.bntu.fitr.poisit.lytkina;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Milk", 10);
        stock.printInformation();
        stock.updatePrice(20);
        stock.printInformation();
        stock.updatePrice(5);
        stock.printInformation();
        stock.updatePrice(15);
        stock.printInformation();
        stock.updatePrice(30);
        stock.printInformation();
        stock.updatePrice(-6);
        stock.printInformation();

        StockDemo stockDemo = new StockDemo();
        stockDemo.test(stock);
    }

    public void test(Stock stock){
        StockTest stockTest = new StockTest();
        double expectedCurrentPrice = 30;
        double expectedMinPrice = 5;
        double expectedMaxPrice = 30;

        double actualCurrentPrice = stock.currentPrice;
        double actualMinPrice = stock.minPrice;
        double actualMaxPrice = stock.maxPrice;

        stockTest.checkThatEqual(expectedCurrentPrice, expectedMinPrice, expectedMaxPrice, actualCurrentPrice, actualMinPrice, actualMaxPrice);
    }
}
