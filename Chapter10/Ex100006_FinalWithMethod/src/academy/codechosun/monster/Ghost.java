package academy.codechosun.monster;

public class Ghost extends Monster {
    public Ghost (int hp, int attack, int defense) {
        super(hp, attack, defense);
    }

    public int calculateDamage(Monster target) {
        return target.getDefence() - target.getAttack();
    }

}



