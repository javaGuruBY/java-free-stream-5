package by.jrr.Ruslan_sto_HW4_e4_Stock.Service;

import by.jrr.Ruslan_sto_HW4_e4_Stock.Bean.Stock;

public class StockService {
    public void updatePrice (Stock stock, double newPrice){
        stock.setActualPrice(newPrice);
        if (newPrice < stock.getMinPrice()){
            stock.setMinPrice(newPrice);
        } else  if (newPrice>stock.getMaxPrice()){
            stock.setMaxPrice(newPrice);
        }

    }
    public String printInformation (Stock stock){
        String information = "Company = "+stock.getCompanyName()+".  min price = "+stock.getMinPrice()+ ".  Max price = "+stock.getMaxPrice()+".  Actual price = "+stock.getActualPrice();
        return information;
    }
}
