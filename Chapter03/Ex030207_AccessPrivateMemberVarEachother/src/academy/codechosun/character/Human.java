package academy.codechosun.character;

public class Human {
    private String name;
    private float hp;
    private float exp;

    public Human(String name) {
        this(name, 100.f, 0.f);
    }

    /*
      user does not initialize the hp or exp.
      Only can initialize the name.  
    */

    private Human() {
        this(null, 100.f, 0.f);
    }

    private Human(String name, float hpOrExp) {
        this(name, hpOrExp, hpOrExp);
    }
    
    private Human(String name, float hp, float exp) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
    }

    public void attack(Human enemy) {
        System.out.printf("%s attacks %s.%s", this.name, enemy.name, System.lineSeparator());
        
        enemy.hp -= 10;
        this.exp += 10;

        System.out.printf("%s's hp: %.1f%s", enemy.name, enemy.hp, System.lineSeparator());
        System.out.printf("%s's exp: %.1f%s", this.name, this.exp, System.lineSeparator());

    }

}



