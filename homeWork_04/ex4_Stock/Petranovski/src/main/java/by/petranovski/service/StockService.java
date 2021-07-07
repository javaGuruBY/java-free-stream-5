package by.petranovski.service;

import by.petranovski.bean.Stock;

public class StockService {
    public void updatePrice(Stock stock, double newPrice) {
        stock.setPresentValue(newPrice);
        if (stock.getMinCost() > newPrice) {
            stock.setMinCost(newPrice);
        } else if (newPrice > stock.getMaxCost()) {
            stock.setMaxCost(newPrice);
        }
    }
    public String printInformation(Stock stock) {
        String information = "Company = " + stock.getNameCompany() + ", Current Price = " + stock.getPresentValue() + ", Min Price = " + stock.getMinCost() + ", Max Price = " + stock.getMaxCost();
        return information;
    }
}
