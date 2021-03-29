package academy.codechosun.monster;

public class Ogre extends Monster {
    public Ogre(int hp, int attack, int defense) {
        super(hp, attack, defense);
    }

    public int calculateDamage(Monster target) {
        return this.getAttack() + target.getAttack() - target.getDefence();
    }

}




