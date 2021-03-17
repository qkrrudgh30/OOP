package academy.codechosun.models;

public class FlowerPot {
    private boolean alive = true;
    private int minDailyWaterInMl;
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

    public void addWater(WaterSpray waterSpray) {
        SprayHead head = waterSpray.getHead();
        SprayBottle bottle = waterSpray.getBottle();

        int water = bottle.getRemainingWater();
        head.spray();
        water -= bottle.getRemainingWater();

        this.dailyReceivedWater += water;

    }

}



