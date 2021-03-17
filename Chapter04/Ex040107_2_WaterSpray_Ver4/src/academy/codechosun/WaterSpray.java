package academy.codechosun;

public class WaterSpray {
    private final int capacity;
    private int remainingWaterInMl = 0;

    public WaterSpray(int capacity) {
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
        this.remainingWaterInMl = Math.min(this.remainingWaterInMl, this.capacity);
    } 

    public void spray() {
        this.remainingWaterInMl -= Math.min(this.remainingWaterInMl, 5);
    }

}


