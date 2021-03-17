package academy.codechosun.engine;

import academy.codechosun.models.*;


public class App {
    public static void main(String[] args) {
        WaterSpray fastButSmallWaterSpray = new WaterSpray(SprayHeadSpeed.FAST, SprayBottleSize.SMALL);
        WaterSpray slowButLargeWaterSpray = new WaterSpray(SprayHeadSpeed.SLOW, SprayBottleSize.LARGE); 

        fastButSmallWaterSpray.getBottle().fillUp();
        FlowerPot bigPot = new FlowerPot(30);

        for (int i = 0; i < 3; ++i) {
            bigPot.addWater(fastButSmallWaterSpray);
            System.out.printf("bigPot's received water: %s.%s", bigPot.getReceivedWater(), System.lineSeparator());

        }

        bigPot.liveAnotherDay();
        System.out.printf("bigPot alive? %s.%s", bigPot.isAlive(), System.lineSeparator());

    }

}



