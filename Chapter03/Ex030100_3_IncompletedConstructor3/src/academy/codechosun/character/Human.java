package academy.codechosun.character;

public class Human {
    public String name;
    public float weight;
    public float height;

    public Human(String name, float height) {
        this(name, height >= 150 ? 150 : 50, height);
    }

    public Human(String name, float weight, float height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

}



