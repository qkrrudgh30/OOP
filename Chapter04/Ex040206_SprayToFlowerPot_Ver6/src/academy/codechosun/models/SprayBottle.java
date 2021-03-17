package academy.codechosun.models;

public class SprayBottle {
    private int capacity;
    private int remainingWaterInMl = 0;

    public SprayBottle(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getRemainingWater() {
        return this.remainingWaterInMl;
    }

    public void addWater(int amountInMl) {
        this.remainingWaterInMl += amountInMl;
        this.remainingWaterInMl = Math.min(remainingWaterInMl, capacity);
    }

    public void reduceWater(int ml) {
        this.remainingWaterInMl -= Math.min(this.remainingWaterInMl, ml);
    }

    public void fillUp() {
        this.remainingWaterInMl = this.capacity;
    }

}



