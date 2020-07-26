package by.jrr.Ruslan_sto_HW3_Ex5_Product.Servis;

import by.jrr.Ruslan_sto_HW3_Ex5_Product.Bean.Product;

import java.awt.peer.TextAreaPeer;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @org.junit.Test
    public void actualPrice() {
        Product product = new Product("apple", 200, 20);
        ProductService productService=new ProductService();
        double expected = 160;
        double actual = productService.actualPrice(product);
        assertEquals(expected,actual,0);
//        double  expected = 1.5;
//        ProductService productService = new ProductService();
//        Product product = new Product();
//        double  actual = productService.actualPrice(product);
//        assertEquals(expected, actual,0);

    }

    @org.junit.Test
    public void printInformation() {
        Product product =new Product("Orange", 154, 5);
        ProductService productService=new ProductService();
        String expected = "Name = "+product.getName()+" , price = "+product.getRegularPrice()+ " , discount = "+product.getDiscount();
        String actual = productService.printInformation(product);
        assertEquals("Print information was not equal", expected, actual);
    }
}