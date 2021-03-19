package academy.codechosun.engine;

import academy.codechosun.singleton.Singleton;

public class App {
    public static void main(String[] args) {
        Singleton instance0 = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println("Same object? " + (instance0 == instance1));

    }

}



