package academy.codechosun.character;

public class Human {
    public String name;
    public float weight;
    public float height;

    public void walk() {
        this.weight -= 1;
        this.height += 1;
    }

    public void eat() {
        this.weight += 1;
        this.height += 1;
    }

    public void speak() {
        System.out.printf("Hello, my name is %s.%s", this.name, System.lineSeparator());
    }

}



