package jrr.by.mikhalchenko.bean;

public class Stock {
    private String nameCompany;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock() {
    }

    public Stock(String nameCompany, int currentPrice) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
        this.minPrice =  currentPrice;
        this.maxPrice =  currentPrice;
}

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
