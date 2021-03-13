package academy.codechosun.engine;

import academy.codechosun.character.Human;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Choco");

        System.out.printf("Hi, my name is %s.%s", adam.getName(), System.lineSeparator());

        adam.setName("Adam");

        System.out.printf("Hi, my name is %s.%s", adam.getName(), System.lineSeparator());
        
    }
}



