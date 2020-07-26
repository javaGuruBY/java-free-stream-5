package by.jrr.Ruslan_sto_HW3_Ex5_Product;

import by.jrr.Ruslan_sto_HW3_Ex5_Product.Bean.Product;
import by.jrr.Ruslan_sto_HW3_Ex5_Product.Servis.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("banana",15, 10);
//        Product product = new Product("orange",20, 5);

        ProductService productService= new ProductService();
        product.printInformation();
        System.out.println("Actual PRICE - "+productService.actualPrice(product)+" EUR");
        System.out.println();
    }
}
