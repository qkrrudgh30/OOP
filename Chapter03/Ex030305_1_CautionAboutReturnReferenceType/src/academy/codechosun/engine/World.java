package academy.codechosun.engine;

import academy.codechosun.character.Human;
import academy.codechosun.character.Dog;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam");
        Human eve = new Human("Eve");

        Dog choco = new Dog("Choco", "Eve");
        eve.setPet(choco);
        System.out.printf("%s's owner is %s.%s", choco.getName(), choco.getOwner(), System.lineSeparator());

        adam.setPet(eve.getPet());
        System.out.printf("%s's owner is %s.%s", choco.getName(), choco.getOwner(), System.lineSeparator());
        System.out.printf("Adam's pet is %s.%s", adam.getPet().getName(), System.lineSeparator());

    }
}



