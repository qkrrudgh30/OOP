package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human();

        adam.name = "Adam";
        adam.weight = 75.9;

        adam += 1;

    }
    
}


