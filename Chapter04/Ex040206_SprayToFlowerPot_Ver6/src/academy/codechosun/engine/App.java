package academy.codechosun.engine;

import academy.codechosun.models.WaterSpray;
import academy.codechosun.models.SprayHead;
import academy.codechosun.models.SprayBottle;
import academy.codechosun.models.FlowerPot;


public class App {
    public static void main(String[] args) {
        SprayHead fastHead = new SprayHead(15);

        SprayBottle bigBottle = new SprayBottle(300);
        bigBottle.fillUp();

        WaterSpray waterSpray1 = new WaterSpray(fastHead, bigBottle);
        FlowerPot bigPot = new FlowerPot(30);

        for (int i = 0; i < 3; ++i) {
            bigPot.addWater(waterSpray1);
            System.out.printf("bigPot's received water: %s.%s", bigPot.getReceivedWater(), System.lineSeparator());

        }

        bigPot.liveAnotherDay();
        System.out.printf("bigPot alive? %s.%s", bigPot.isAlive(), System.lineSeparator());

    }

}



