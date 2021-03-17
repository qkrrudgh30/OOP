package academy.codechosun.models;

public class FlowerPot {
    private boolean alive = true;
    private final int minDailyWaterInMl;
    private int dailyReceivedWater = 0;

    public FlowerPot(int minDailyWaterInMl) {
        this.minDailyWaterInMl = minDailyWaterInMl;
    }

    public boolean isAlive() {
        return this.alive;
    } 

    public int getMinDailyWaterInMl() {
        return this.minDailyWaterInMl;
    }

    public int getReceivedWater() {
        return this.dailyReceivedWater;
    }

    public void addWater(int amountInMl) {
        this.dailyReceivedWater += amountInMl;
    }

    public void liveAnotherDay() {
        if (dailyReceivedWater < minDailyWaterInMl) {
            alive = false;
        }

        dailyReceivedWater = 0;

    }

}



