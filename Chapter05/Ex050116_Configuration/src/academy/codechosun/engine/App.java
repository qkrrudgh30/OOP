package academy.codechosun.engine;

import academy.codechosun.config.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();

        config.load("settings.csv");

        int windowX = 100;
        int windowY = 200;

        config.setX(windowX);
        config.setY(windowY);

        config.save("settings.csv");

    }

}



