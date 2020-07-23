package by.jrr.maistrenko;

public class ProductDemo {

    public static void main(String[] args) {
        Product milk = new Product("Milk");
        milk.setDiscount(20);
        milk.setRegularPrice(0.8);
        milk.actualPrice();
        milk.printInformation();
    }
}
