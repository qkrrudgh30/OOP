package academy.codechosun.models;

public final class Robot {
    private int hp;
    private Head head;

    public Robot(int initialHp, Head head) {
        this.hp = initialHp;
        this.head = head;
    }

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

}
