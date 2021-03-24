package academy.codechosun.engine;

import java.util.ArrayList;
import academy.codechosun.components.*;

public class Program {
    public static void main(String[] args) {
        GameObject player = new GameObject("player");

        player.addComponent(new EntityComponent());
        player.addComponent(new PhysicsComponent());
        player.addComponent(new ControllableComponent());

        player.update();

        GameObject npc = new GameObject("Soo Park");

        npc.addComponent(new EntityComponent());
        npc.addComponent(new PhysicsComponent());

        npc.update();

        GameObject aiNpc = new GameObject("Park Soo");

        aiNpc.addComponent(new EntityComponent());
        aiNpc.addComponent(new PhysicsComponent());
        aiNpc.addComponent(new AiComponent());

        aiNpc.update();

    }

}



