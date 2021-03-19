package academy.codechosun.engine;

import academy.codechosun.modules.Math;

public class App {
    public static void main(String[] args) {
        int absVal = Math.abs(-7);
        System.out.printf("absVal: %d%s", absVal, System.lineSeparator());

        int maxVal = Math.max(8, 5);
        System.out.printf("maxVal: %d%s", maxVal, System.lineSeparator());

    }

}



