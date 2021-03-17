package academy.codechosun;

public class WaterSpray {
    private int remainingWaterInMl = 0;
    private static final int CAPACITY = 200;

    public WaterSpray() {}

    public int getRemainingWater() {
        return this.remainingWaterInMl;
    }

    public void addWater(int amountInMl) {
        this.remainingWaterInMl += amountInMl;
        this.remainingWaterInMl = Math.min(remainingWaterInMl, CAPACITY);
    }

    public void spray() {
        this.remainingWaterInMl = Math.min(this.remainingWaterInMl, 5);
    }

} 



