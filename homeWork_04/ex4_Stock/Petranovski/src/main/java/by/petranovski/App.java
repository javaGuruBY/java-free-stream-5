package by.petranovski;

import by.petranovski.bean.Stock;
import by.petranovski.service.StockService;

public class App {
    public static void main(String[] args) {
        StockService stockService = new StockService();
        Stock stock = new Stock("Shell", 500);
        System.out.println(stockService.printInformation(stock));
        stockService.updatePrice(stock, 100);
        System.out.println(stockService.printInformation(stock));
        stockService.updatePrice(stock, 600);
        System.out.println(stockService.printInformation(stock));

    }
}
