package academy.codechosun.engine;

import academy.codechosun.models.Clock;

public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.addSecondes(10800);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

        clock.addSecondes(-10);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());
        
        clock.addSecondes(100);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

    }

}



