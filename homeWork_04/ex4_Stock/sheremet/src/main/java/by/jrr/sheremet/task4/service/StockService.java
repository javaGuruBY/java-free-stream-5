package by.jrr.sheremet.task4.service;

import by.jrr.sheremet.task4.bean.Stock;

public class StockService {
    public void updateCurrentCost(Stock stock, int cost) {
        if (cost < stock.getMinCost()) {
            stock.setMinCost(cost);
        } else if (cost > stock.getMaxCost()) {
            stock.setMaxCost(cost);
        }
        stock.setCurrentCost(cost);
    }

    public void printInformation(Stock stock) {
        System.out.println(stock);
    }
}
