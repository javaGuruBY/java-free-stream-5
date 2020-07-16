package by.bntu.fitr.poisit.lytkina;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(){

    }
    public Product(String name){
        this.name = name;
    }
    double actualPrice( double regularPrice, double discount){
        return regularPrice - regularPrice * (discount/100);
    }
    void printInformation(Product product){
        System.out.println("Product name: " +  product.name + "\nActual price: " + product.regularPrice +
                "\nDiscount: " + product.discount + "%" + "\nPrice with discount: " + product.actualPrice(product.regularPrice, product.discount));
    }
}
