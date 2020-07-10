package AndryBorisevich;

public class App {
    public static void main(String[] args) {
        BottleOfWater newBottle = new BottleOfWater(2);
        newBottle.drinkSomeWater(1.5);
        newBottle.drinkSomeWater(2);

        Bin bin = new Bin();
        bin.fillUpBin(newBottle);
        bin.fillUpBin(20);
        bin.cleanBin();

        Book book = new Book("Breakfast at Tiffany's","Trumen Capote", 200);
        book.readSomePage(100);
        book.readSomePage(100);

        Key key = new Key();
        key.setTypeKey("Door");
        key.openThingWithInputTypeOfKey();

        SunGlasses sunGlasses = new SunGlasses();
        sunGlasses.putSunGlassesOn();

        cup cup = new cup ("tea",0.34);
        cup.sipAtCupOf(0.12);
        cup.sipAtCupOf(0.22);
    }
}
