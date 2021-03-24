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
        digitalClock.setTime(false, (byte)12, (byte)59, (byte)59);
        System.out.printf("%s %d:%d:%d%s", digitalClock.isBeforeMidday() ? "AM":"PM", digitalClock.getHours(), digitalClock.getMinutes(), digitalClock.getSeconds(), System.lineSeparator());
        digitalClock.tick();
        System.out.printf("%s %d:%d:%d%s", digitalClock.isBeforeMidday() ? "AM":"PM", digitalClock.getHours(), digitalClock.getMinutes(), digitalClock.getSeconds(), System.lineSeparator());
        
    }

}



