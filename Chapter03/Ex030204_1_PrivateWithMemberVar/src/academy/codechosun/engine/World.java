package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 73.9f, 173.9f);
        System.out.printf("%s's weight: %.1f\t height: %.1f%s", adam.name, adam.weight, adam.height, System.lineSeparator());

        adam.weight = 0.f;
        System.out.printf("%s's weight: %.1f\t height: %.1f%s", adam.name, adam.weight, adam.height, System.lineSeparator());
    }

}



