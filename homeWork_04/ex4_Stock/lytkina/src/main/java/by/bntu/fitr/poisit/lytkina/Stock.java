package by.bntu.fitr.poisit.lytkina;

public class Stock {
    String companyName;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String name, double currentPrice){
        this.companyName = name;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    public double updatePrice(double newPrice){
        if (newPrice <= 0){
            return currentPrice;
        }
        if (newPrice > maxPrice){
            maxPrice = newPrice;
        }
        if (newPrice < minPrice){
            minPrice = newPrice;
        }
        currentPrice = newPrice;
        return currentPrice;
    }
    public void printInformation(){
        System.out.println("Company name  = " + companyName + "\nCurrent price = " + currentPrice +
                "\nMin price = " + minPrice + "\nMax price = " + maxPrice);
    }
}
