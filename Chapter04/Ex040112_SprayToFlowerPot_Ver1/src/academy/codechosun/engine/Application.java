package academy.codechosun.engine;

import academy.codechosun.models.FlowerPot;
import academy.codechosun.models.WaterSpray;

public class Application {
    public static void main(String[] args) {
        WaterSpray waterSpray = new WaterSpray(100);
        waterSpray.fillUp();

        FlowerPot pot = new FlowerPot(5);

        int water = waterSpray.getRemainingWater();
        waterSpray.spray();
        water -= waterSpray.getRemainingWater();

        pot.addWater(water);

        System.out.printf("pot alive? %s.%s", pot.isAlive(), System.lineSeparator());

        FlowerPot bigPot = new FlowerPot(10);

        for (int i = 0; i < 2; ++i) {
            water = waterSpray.getRemainingWater();
            waterSpray.spray();
            water -= waterSpray.getRemainingWater();

            bigPot.addWater(water);
        }
        
        System.out.printf("pot alive? %s.%s", bigPot.isAlive(), System.lineSeparator());

    }

}



