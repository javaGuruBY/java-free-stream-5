package by.jrr.sheremet.task4.service;

import by.jrr.sheremet.task4.bean.Stock;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StockServiceTest {

    @Test
    public void testUpdatingCurrentCost() {
        int newCost = 20;
        Stock stock = new Stock("Yahoo", 10);
        StockService service = new StockService();
        int expected  = 20;
        int actual;
        service.updateCurrentCost(stock, newCost);
        actual = stock.getCurrentCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testUpdatingCurrentCostAndMinCost() {
        int newCost = 10;
        Stock stock = new Stock("Yahoo", 10);
        StockService service = new StockService();
        int expected  = 10;
        int actual;
        service.updateCurrentCost(stock, newCost);
        actual = stock.getMinCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testUpdatingCurrentCostAndMaxCost() {
        int newCost = 30;
        Stock stock = new Stock("Yahoo", 10);
        StockService service = new StockService();
        int expected  = 30;
        int actual;
        service.updateCurrentCost(stock, newCost);
        actual = stock.getMaxCost();
        assertEquals(expected, actual);
    }

    @Test
    public void printInformationTest() {
        Stock stock = new Stock("Yahoo", 10);
        StockService service = new StockService();
        String expected = "Company = \"Yahoo\", Current Price = 10, Min Price = 10, Max Price = 10";
        service.printInformation(stock);
        String actual = stock.toString();
        assertEquals(expected, actual);
    }
}