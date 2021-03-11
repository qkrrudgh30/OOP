package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human();
        adam.name = "Adam";
        adam.weight = 73.9f;

        adam.speak();
        System.out.printf("%s's weight: %f%s", adam.name, adam.weight, System.lineSeparator());
        adam.walk();
        System.out.printf("%s's weight: %f%s", adam.name, adam.weight, System.lineSeparator());
        adam.eat();
        System.out.printf("%s's weight: %f%s", adam.name, adam.weight, System.lineSeparator());
        

    }
}



