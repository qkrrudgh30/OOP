package academy.codechosun.engine;

import academy.codechosun.models.WaterSpray;
import academy.codechosun.models.FlowerPot;

public class Application {
    public static void main(String[] args) {
        WaterSpray waterSpray = new WaterSpray(100);
        waterSpray.fillUp();

        FlowerPot bigPot = new FlowerPot(15);

        for (int i = 0; i < 3; ++i) {
            waterSpray.sprayTo(bigPot);
            System.out.printf("bigPot's received water: %s.%s", bigPot.getReceivedWater(), System.lineSeparator());

        }

        bigPot.liveAnotherDay();
        System.out.printf("bigPot alive? %s.%s", bigPot.isAlive(), System.lineSeparator());

    }

}



