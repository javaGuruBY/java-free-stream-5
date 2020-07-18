package by.bntu.fitr.poisit.lytkina;

public class StockTest {
    public void checkThatEqual(double expectedCurrentPrice, double expectedMinPrice, double expectedMaxPrice,
                               double actualCurrentPrice, double actualMinPrice, double actualMaxPrice)
    {
        if ( expectedCurrentPrice == actualCurrentPrice && expectedMaxPrice == actualMaxPrice && expectedMinPrice == actualMinPrice){
            System.out.println("Test was passed");
        }else {
            System.out.println("Test was failed");
        }

    }
}
