package by.jrr.Ruslan_sto_HW3_Ex5_Product.Servis;

import by.jrr.Ruslan_sto_HW3_Ex5_Product.Bean.Product;

public class ProductService {
    public double actualPrice (Product product){
            double discount = (product.getRegularPrice()/100 * product.getDiscount()) ;
            return product.getRegularPrice()-discount;
    }
    public String printInformation(Product product){
        return ("Name = "+product.getName()+" , price = "+product.getRegularPrice()+ " , discount = "+product.getDiscount());

    }
}
