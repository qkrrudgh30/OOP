package academy.codechosun.monster;

public class Ogre extends Monster {
    public Ogre (int hp, int attack, int defence) {
        super(hp, attack, defence);
    }

    public int calculateDamage(Monster target) {
        return this.getAttack() - target.getDefence();
    }

}