package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 73.9f, 173.9f);

        adam.eat();
        adam.walk();

        // adam.sayWeight(); this does not compile.

    }
    
}



