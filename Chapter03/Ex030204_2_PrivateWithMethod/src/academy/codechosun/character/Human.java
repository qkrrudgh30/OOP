package academy.codechosun.character;

public class Human {
    private String name;
    private float weight;
    private float height;

    public Human() {
        this(null, 0.f, 0.f);
    }

    public Human(String name) {
        this(name, 0.f, 0.f);
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
        sayWeight();
    }

    public void eat() {
        this.weight += 1;
        sayWeight();
    }

    public void speak() {
        System.out.printf("Hello, my name is %s.%s", this.name, System.lineSeparator());
    }

    private void sayWeight() {
        System.out.printf("my weight is %.1f.%s", this.weight, System.lineSeparator());
    }


}



