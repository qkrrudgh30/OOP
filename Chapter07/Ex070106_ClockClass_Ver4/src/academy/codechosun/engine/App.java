package academy.codechosun.engine;

import academy.codechosun.models.Clock;

public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.setTime((byte)3, (byte)60, (byte)60);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

        clock.setTime((byte)3, (byte)-62, (byte)-62);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

    }

}



