package academy.codechosun.models;

public final class Robot implements Cloneable {
    private int hp;
    private Head head = new Head();

    public Robot(int initialHp) {
        this.hp = initialHp;
    }

    public int getHp() {
        return this.hp;
    }

    public Head getHead() {
        return this.head;
    }

    public void damage(int amount) {
        this.hp = Math.max(0, this.hp - amount);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

