package academy.codechosun.engine;

import academy.codechosun.modules.Math;

public class App {
    public static void main(String[] args) {
        // int absVal = Math.abs(-2); this does not compile.

        Math math = Math.getInstance();
        int minVal = math.min(-1, 1);
        int maxVal = Math.getInstance().max(3, -1);

    }

}



