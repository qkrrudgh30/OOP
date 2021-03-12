package academy.codechosun.character;

public class Human {
    public String name;
    public float weight;
    public float height;

    public Human() {
        this(null, 0.f, 0.f);
    }

    public Human(String name, float height) {
        this(name, height <= 140 ? height : 0.f, height <= 140 ? 0.f : height);
    }

    public Human(String name, float weight, float height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void walk() {
        this.weight -= 1;
    }

    public void eat() {
        this.weight += 1;
    }

    public void speak() {
        System.out.printf("Hello, my name is %s.%s", this.name, System.lineSeparator());
    }

}

