package by.petranovski.service;

import by.petranovski.bean.Stock;

import javax.swing.*;

import static org.junit.Assert.*;

public class StockServiceTest {

    @org.junit.Test
    public void updatePrice() {
        StockService stockService = new StockService();
        Stock stock = new Stock("Shell", 372.0);
        double newPrice[] = {372.0, 400.0, 200.0, 100.0};
        double maxPriceExpected[] = {372.0, 400.0, 400.0, 400.0};
        double minPriceExpected[] = {372.0, 372.0, 200.0, 100.0};
        for (int i = 0; i < maxPriceExpected.length; i++) {
            stockService.updatePrice(stock, newPrice[i]);
            double actualMax = stock.getMaxCost();
            double actualMin = stock.getMinCost();
            assertEquals(maxPriceExpected[i], actualMax, 0);
            assertEquals(minPriceExpected[i], actualMin, 0);
        }

    }

    @org.junit.Test
    public void printInformation() {
        StockService stockService = new StockService();
        Stock stock = new Stock("Lucoil", 327, 327, 327);
        String expected = "Company = " + stock.getNameCompany() + ", Current Price = " + stock.getPresentValue() + ", Min Price = " + stock.getMinCost() + ", Max Price = " + stock.getMaxCost();
        String actual = stockService.printInformation(stock);
    }
}