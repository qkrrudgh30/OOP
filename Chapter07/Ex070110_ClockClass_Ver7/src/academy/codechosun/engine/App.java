package academy.codechosun.engine;

import academy.codechosun.models.Clock;

public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.addSecondes(12615);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());
        System.out.printf("hourHandAngle: %d%s", clock.getHourHandAngle(), System.lineSeparator());
        System.out.printf("minuteHandAngle: %d%s", clock.getMinuteHandAngle(), System.lineSeparator());
        System.out.printf("secondHandAngle: %d%s", clock.getSecondHandAngle(), System.lineSeparator());
        
    }

}



