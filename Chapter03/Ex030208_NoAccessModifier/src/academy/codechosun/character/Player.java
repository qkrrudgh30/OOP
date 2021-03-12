package academy.codechosun.character;

public class Player {
    String name;
    float hp;
    float exp;

    private Player() {
        this(null, 100.f, 0.f);
    }

    public Player(String name) {
        this(name, 100.f, 0.f);
    }

    private Player(String name, float hpOrExp) {
        this(name, 100.f, 0.f);
    }

    private Player(String name, float hp, float exp) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
    }

}



