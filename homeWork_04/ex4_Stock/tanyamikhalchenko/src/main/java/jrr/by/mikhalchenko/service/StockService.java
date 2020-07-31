package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.Stock;

public class StockService {
    public void updatePrice(Stock stock, double newPrice) {
        stock.setCurrentPrice(newPrice);

        if (newPrice < stock.getMinPrice()) {
             stock.setMinPrice( newPrice);
        }else if (newPrice > stock.getMaxPrice()) {
           stock.setMaxPrice(newPrice);
        }
    }

    public String printInformation(Stock stock){
        String result = "Company = " + stock.getNameCompany() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price =" +  stock.getMaxPrice();

        return result;

    }


}






