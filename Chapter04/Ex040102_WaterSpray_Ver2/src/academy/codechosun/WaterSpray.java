package academy.codechosun;

public class WaterSpray {
    private int remainingWaterInMl;

    public WaterSpray() {}

    public int getRemainingWater() {
        return this.remainingWaterInMl;
    }

    public void addWater(int amountInMl) {
        this.remainingWaterInMl = amountInMl;
    } 

    public void spray() {
        this.remainingWaterInMl -= Math.min(this.remainingWaterInMl, 5);
    }

}



