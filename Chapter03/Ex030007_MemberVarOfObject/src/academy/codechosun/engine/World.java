package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human();
        
        adam.speak();
        System.out.printf("adam.weight: %f%s", adam.weight, System.lineSeparator());

        adam.name = "Adam";
        adam.weight = 74.9f;

        adam.speak();
        System.out.printf("adam.weight: %f%s", adam.weight, System.lineSeparator());

        adam.eat();
        adam.eat();
        adam.walk();

        System.out.printf("adam.weight: %f%s", adam.weight, System.lineSeparator());

    }
}



