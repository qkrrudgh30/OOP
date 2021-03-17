package academy.codechosun.models;

public class FlowerPot {
    private boolean alive = true;
    private final int minDailyWaterInMl;

    public FlowerPot(int minDailyWaterInMl) {
        this.minDailyWaterInMl = minDailyWaterInMl;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public int getMinDailyWaterInMl() {
        return this.minDailyWaterInMl;
    }

    public void addWater(int amountInMl) {
        if (amountInMl < this.minDailyWaterInMl) {
            this.alive = false;
        }
    }

}



