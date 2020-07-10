package AndryBorisevich;

public class cup {
    private String cupOf;
    private double Currentcapacitycup;
    final double capacity = 0.45;

    public cup(String cupOf, double currentcapacitycup) {
        this.cupOf = cupOf;
        Currentcapacitycup = currentcapacitycup;
    }

    public void sipAtCupOf (Double sizeOfsip){
        this.Currentcapacitycup = this.Currentcapacitycup - sizeOfsip;
        System.out.println("You cup has " + String.format("%.2f", this.Currentcapacitycup) + " capacity");
    }

    public void fillUpCupOf(double currentFillUp){
        if (this.Currentcapacitycup + currentFillUp > 0.45) {
            this.Currentcapacitycup = capacity;
            System.out.println("Cup has filled up.");
        }
        {
            this.Currentcapacitycup = this.Currentcapacitycup + currentFillUp;
            System.out.println("Youu cup has filled up " + this.Currentcapacitycup);
        }
    }
}
