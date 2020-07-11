package by.jrr.rakhnianski;

public class Shower {
    public static void main(String[] args) {
        goToShower();
        turnOnWater();
        washHead();
        washBody();
        turnOffWater();
        wipeOff();
        goOut();
    }
    public static void goToShower() {
        System.out.println("Going to shower");
    }
    public static void turnOnWater() {
        System.out.println("Turning on the water");
    }
    public static void washHead() {

        System.out.println("Washing the head");
    }
    public static void washBody() {
        System.out.println("Washing the body");
    }
    public static void turnOffWater() {
        System.out.println("Turning off the water");
    }
    public static void wipeOff() {
        System.out.println("Wiping myself off");
    }
    public static void goOut() {
        System.out.println("Going out");
    }

}
