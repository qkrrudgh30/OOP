package academy.codechosun.engine;

import academy.codechosun.models.Clock;

public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.addSecondes((short) 10800);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

        clock.addSecondes((short) -10);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());
        
        clock.addSecondes((short) 100);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

    }

}



