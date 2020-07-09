package AndryBorisevich;

public class BottleOfWater {
    private double capacityOfBottle;

    public BottleOfWater(double capacityOfBottle) {
        this.capacityOfBottle = capacityOfBottle;
    }

    public void drinkSomeWater (double countOfDrink){

        if ((this.capacityOfBottle - countOfDrink) > 0) {
            this.capacityOfBottle = this.capacityOfBottle - countOfDrink;
            System.out.println("Remaining water is " + this.capacityOfBottle);
        } else {
            System.out.println("You haven`t enough water. You have drunk " + this.capacityOfBottle);
            this.capacityOfBottle = this.capacityOfBottle - countOfDrink;
            System.out.println("Remaining water is " + 0 + " Buy new bottle of water");
        }
    }

}
