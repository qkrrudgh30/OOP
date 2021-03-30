package academy.codechosun.monster;

public class Troll extends Monster {
    public Troll(int hp, int attack, int defense) {
        super(hp, attack, defense);
    }

    public int calculateDamage(Monster target) {
        return this.getAttack() - target.getDefence() / 2;
    }

}




