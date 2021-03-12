package academy.codechosun.engine;

import academy.codechosun.character.Npc;
import academy.codechosun.character.Player;

public class World {
    public static void main(String[] args) {
        Npc park = new Npc("Park");
        Player adam = new Player("Adam");

        park.giveExpToPlayer(adam);

        // adam.exp += 100.f; this does not complie.

    }
}



