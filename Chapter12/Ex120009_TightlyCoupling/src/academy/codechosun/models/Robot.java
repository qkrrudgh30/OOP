package academy.codechosun.models;

public final class Robot {
    private int hp;
    private Head head;

    public Robot(int initialHp) {
        this.hp = initialHp;
        this.head = new Head();
    }

}



