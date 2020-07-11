package by.jrr.rakhnianski;

public class Fishing {
    public static void main(String[] args) {
        plantBait();
        throwHook();
        waitForFish();
        removeFish();
        putFishInBucket();

    }
    public static void plantBait() {
        System.out.println("Planting a bait");
    }
    public static void throwHook() {
        System.out.println("Throwing a hook into the water");
    }
    public static void waitForFish() {
        System.out.println("Waiting until a fish bites");
    }
    public static void removeFish() {
        System.out.println("Removing the fish");
    }
    public static void putFishInBucket() {
        System.out.println("Putting fish in the bucket");
    }

}
