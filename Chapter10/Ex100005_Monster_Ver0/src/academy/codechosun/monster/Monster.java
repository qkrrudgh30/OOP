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

    public final void attack(Monster target) {
        int damage = calculateDamage(target);
        target.hp = Math.max(0, target.hp - damage);
    }

    public int calculateDamage(Monster target) {
        return 0;
    }

    protected void inflictDamage(int amount) {
        this.hp = Math.max(0, this.hp - amount);
    }

}




