package academy.codechosun.engine;

import academy.codechosun.models.WaterSpray;
import academy.codechosun.models.SprayHead;
import academy.codechosun.models.SprayBottle;

public class App {
    public static void main(String[] args) {
        SprayHead head = new SprayHead(5);
        SprayBottle bottle = new SprayBottle(100);
        WaterSpray waterSpray1 = new WaterSpray(head, bottle);

        SprayHead slowHead = new SprayHead(1);
        SprayBottle bigBottle = new SprayBottle(300);
        WaterSpray waterSpray2 = new WaterSpray(head, bottle);

        SprayHead fastHead = new SprayHead(10);
        SprayBottle smallBottle = new SprayBottle(50);
        WaterSpray waterSpray3 = new WaterSpray(head, bottle);

    }

}



