package academy.codechosun.models;

public final class Robot implements Cloneable {
    private int hp;

    public Robot(int initialHp) {
        this.hp = initialHp;
    }

    public int getHp() {
        return this.hp;
    }

    public void damage(int amount) {
        this.hp = Math.max(0, this.hp - amount);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

