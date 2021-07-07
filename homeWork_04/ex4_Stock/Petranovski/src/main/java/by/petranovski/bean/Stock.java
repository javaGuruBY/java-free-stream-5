package by.petranovski.bean;

import java.util.Objects;

public class Stock {
    private String nameCompany;
    private double presentValue;
    private double minCost;
    private double maxCost;

    public Stock() {

    }
    public Stock(String nameCompany, double presentValue) {
        this.nameCompany = nameCompany;
        this.presentValue = presentValue;
        this.minCost = presentValue;
        this.maxCost = presentValue;
    }

    public Stock(String nameCompany, double presentValue, double minCost, double maxCost) {
        this.nameCompany = nameCompany;
        this.presentValue = presentValue;
        this.minCost = minCost;
        this.maxCost = maxCost;
    }

    public String getNameCompany() {
        return nameCompany;
    }
    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getPresentValue() {
        return presentValue;
    }

    public void setPresentValue(double presentValue) {
        this.presentValue = presentValue;
    }

    public double getMinCost() {
        return minCost;
    }

    public void setMinCost(double minCost) {
        this.minCost = minCost;
    }

    public double getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(double maxCost) {
        this.maxCost = maxCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.presentValue, presentValue) == 0 &&
                Double.compare(stock.minCost, minCost) == 0 &&
                Double.compare(stock.maxCost, maxCost) == 0 &&
                Objects.equals(nameCompany, stock.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCompany, presentValue, minCost, maxCost);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "nameCompany='" + nameCompany + '\'' +
                ", presentValue=" + presentValue +
                ", minCost=" + minCost +
                ", maxCost=" + maxCost +
                '}';
    }
}
