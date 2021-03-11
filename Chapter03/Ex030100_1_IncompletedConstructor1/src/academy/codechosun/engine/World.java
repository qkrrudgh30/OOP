package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 73.9f);
        Human eve = new Human("Eve", 58.3f);

        System.out.printf("Name: %s\tWeight: %.1f%s", adam.name, adam.weight, System.lineSeparator());
        System.out.printf("Name: %s\tWeight: %.1f%s", eve.name, eve.weight, System.lineSeparator());

    }
}



