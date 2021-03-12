package academy.codechosun.character;

public class Human {
    private String name;
    private float weight;
    private float height;

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
        weight -= 1;
    }

    public void eat() {
        height += 1;
    }

    public void speak() {
        System.out.printf("Hello, my name is %s.%s", this.name, System.lineSeparator());
    }

}



