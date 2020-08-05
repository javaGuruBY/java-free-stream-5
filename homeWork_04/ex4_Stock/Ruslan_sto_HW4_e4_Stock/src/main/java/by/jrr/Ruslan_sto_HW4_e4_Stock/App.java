package by.jrr.Ruslan_sto_HW4_e4_Stock;

import by.jrr.Ruslan_sto_HW4_e4_Stock.Bean.Stock;
import by.jrr.Ruslan_sto_HW4_e4_Stock.Service.StockService;

public class App {
    public static void main(String[] args) {
        StockService stockService=new StockService();
        Stock stock=new Stock("ZTE",150);
        stockService.updatePrice(stock, 200);
//        System.out.println(stockService.printInformation(stock));
        stockService.updatePrice(stock, 100);
//        System.out.println(stockService.printInformation(stock));
        stockService.updatePrice(stock, 125);
        System.out.println(stockService.printInformation(stock));
    }
}
