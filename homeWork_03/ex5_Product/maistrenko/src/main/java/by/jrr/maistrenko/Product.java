package by.jrr.maistrenko;

import java.text.DecimalFormat;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return regularPrice * (1 - discount / 100);
    }

    public void printInformation() {
        System.out.println("Product: name = \"" + name + "\", regular price = " + regularPrice + " EUR, discount = " +
                discount + "%, actual price = " + new DecimalFormat("#0.00").format(actualPrice()) + " EUR.");
    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
