package academy.codechosun.monster;

public class Monster {
    private int hp;
    private int attack;
    private int defense;

    public Monster(int hp, int attack, int defense) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefence() {
        return this.defense;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void attack(Monster target) {}

    protected void inflictDamage(int amount) {
        this.hp = Math.max(0, this.hp - amount);
    }

    public abstract int calculateDamage(Monster target);

}




