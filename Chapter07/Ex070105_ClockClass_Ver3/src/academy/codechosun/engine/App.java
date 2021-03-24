package academy.codechosun.engine;

import academy.codechosun.models.Clock;

public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.setTime((byte)-15, (byte)104, (byte)-88);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

        clock.setTime((byte)9, (byte)50, (byte)37);
        System.out.printf("%d:%d:%d%s", clock.getHours(), clock.getMinutes(), clock.getSeconds(), System.lineSeparator());

    }

}



