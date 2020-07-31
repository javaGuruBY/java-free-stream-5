package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.Stock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockServiceTest {

    @Test
    public void printInformation() {
        Stock stock = new Stock("Apple", 370);
        StockService stockService = new StockService();
        String expected = "Company = " + stock.getNameCompany() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price =" + stock.getMaxPrice();
        String actual = stockService.printInformation(stock);
        assertEquals(expected, actual);

    }

    @Test
    public void updatePrice() {
        StockService stockService = new StockService();
        Stock stok = new Stock("ADBE", 432);
        double newPrice[] = {435, 438, 430, 431};
        double maxPriceExpected[] = {435, 438, 438, 438};
        double minPriceExpected[] = {432, 432, 430, 430};
        for (int i = 0; i < maxPriceExpected.length; i++) {
            stockService.updatePrice(stok, newPrice[i]);
            double actualMaxPrice = stok.getMaxPrice();
            double actualMinPrice = stok.getMinPrice();
            assertEquals(maxPriceExpected[i], actualMaxPrice, 0);

        }
    }
}

