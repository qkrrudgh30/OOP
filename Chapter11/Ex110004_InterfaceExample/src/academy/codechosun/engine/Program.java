package academy.codechosun.engine;

import academy.codechosun.monster.*;

public class Program {
    public static void main(String[] args) {
        Monster troll = new Troll(100, 10, 40);
        Monster ogre = new Ogre(200, 30, 0);

        boolean isAlive = troll.canSurviveAttackFrom(ogre);
        System.out.println("troll is alive? " + isAlive);

    }

}



