package academy.codechosun.character;

public class Human {
    private String name;
    private float weight;
    private float height;

    public Human(String name) {
        this(name, 170.f, 70.f);
    }

    private Human(String name, float weight, float height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}



