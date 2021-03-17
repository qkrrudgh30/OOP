package academy.codechosun;

public class FlowerPot {
    private boolean alive = true;
    private int minDailyWaterInMl;

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
        if (amountInMl < minDailyWaterInMl) {
            this.alive = false;
        }
    }

}



