package by.jrr.Ruslan_sto_HW4_e4_Stock.Service;

import by.jrr.Ruslan_sto_HW4_e4_Stock.Bean.Stock;

import static org.junit.Assert.*;

public class StockServiceTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }
    @org.junit.Test
    public void updatePrice() {
        StockService stockService = new StockService();
        Stock stock = new Stock("ZTE", 150);
        double newPrice []={200,230,130,100};
        double maxPriceExpected []={200,230,230,230};
        double minPriceExpected[]={150,150,130,100};
        for (int i = 0; i < maxPriceExpected.length; i++) {
            stockService.updatePrice(stock, newPrice[i]);
            double actualMaxPrice = stock.getMaxPrice();
            double actualMinPrice = stock.getMinPrice();
            assertEquals(maxPriceExpected[i], actualMaxPrice, 0);
            assertEquals(minPriceExpected[i], actualMinPrice, 0);
        }
    }
    @org.junit.Test
    public void printInformation() {
    }
}

//    Stock expected []={new Stock("Apple", 200)}, new Stock("MacDac", 100), new Stock("Dollar", 20);
