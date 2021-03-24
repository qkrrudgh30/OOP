package academy.codechosun.engine;

import academy.codechosun.models.Clock;
import academy.codechosun.models.AnalogClock;
import academy.codechosun.models.DigitalClock;

public class App {
    public static void main(String[] args) {
        AnalogClock analogClock = new AnalogClock();

        analogClock.addSecondes(8219);
        System.out.printf("%d:%d:%d%s", analogClock.getHours(), analogClock.getMinutes(), analogClock.getSeconds(), System.lineSeparator());
        analogClock.tick();
        System.out.printf("%d:%d:%d%s", analogClock.getHours(), analogClock.getMinutes(), analogClock.getSeconds(), System.lineSeparator());

        DigitalClock digitalClock = new DigitalClock();
        System.out.printf("%d:%d:%d%s", digitalClock.getHours(), digitalClock.getMinutes(), digitalClock.getSeconds(), System.lineSeparator());
        digitalClock.tick();
        System.out.printf("%d:%d:%d%s", digitalClock.getHours(), digitalClock.getMinutes(), digitalClock.getSeconds(), System.lineSeparator());
        
    }

}



