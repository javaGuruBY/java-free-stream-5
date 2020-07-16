package by.bntu.fitr.poisit.lytkina;

public class ProductDemo {
    public static void main(String[] args) {
        Product  product = new Product("Milk");
        product.regularPrice = 10;
        product.discount = 20;

        product.printInformation(product);
    }
}
