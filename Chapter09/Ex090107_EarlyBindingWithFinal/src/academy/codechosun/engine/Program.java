package academy.codechosun.engine;

import academy.codechosun.models.*;

public class Program {
    public static void main(String[] args) {
        Athlete player1 = new BasketballPlayer(202, 110);
        System.out.println(player1.getHeight());

        Athlete player2 = new MmaPlayer(202, 110);
        System.out.println(player2.getHeight());

    }

}



