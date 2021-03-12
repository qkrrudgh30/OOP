package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam");
        Human eve = new Human("Eve");

        adam.attack(eve);

    }
}



