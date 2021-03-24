package academy.codechosun.engine;

import academy.codechosun.models.Clock;
import academy.codechosun.models.AnalogClock;

public class App {
    public static void main(String[] args) {
        AnalogClock analogClock = new AnalogClock();

        analogClock.addSecondes(12615);
        System.out.printf("%d:%d:%d%s", analogClock.getHours(), analogClock.getMinutes(), analogClock.getSeconds(), System.lineSeparator());
        System.out.printf("hourHandAngle: %d%s", analogClock.getHourHandAngle(), System.lineSeparator());
        System.out.printf("minuteHandAngle: %d%s", analogClock.getMinuteHandAngle(), System.lineSeparator());
        System.out.printf("secondHandAngle: %d%s", analogClock.getSecondHandAngle(), System.lineSeparator());
        
    }

}



