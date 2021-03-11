package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class NewObject {
    public static void main(String[] args) {
        Human me = new Human();

        me.weight = 75.3;

        me.speak();

        System.out.println("My weight: ".format("%f", me.weight));
    }

}



