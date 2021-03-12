package academy.codechosun.character;

public class Npc {
    private String name;

    private Npc() {
        this(null);
    }

    public Npc(String name) {
        this.name = name;
    }
    
    public void giveExpToPlayer(Player player) {
        System.out.printf("Npc %s gives 77 Exp. to %s Player.%s", this.name, player.name, System.lineSeparator());

        player.exp += 77.f;

        System.out.printf("Player %s's Exp: %.1f%s", player.name, player.exp, System.lineSeparator());

    }

}



