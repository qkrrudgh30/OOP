package academy.codechosun.models;

public final class Robot implements IRobot {
    private int hp;
    private IHead head;

    public Robot(int initialHp, IHead head) {
        this.hp = initialHp;
        this.head = head;
    }

}



