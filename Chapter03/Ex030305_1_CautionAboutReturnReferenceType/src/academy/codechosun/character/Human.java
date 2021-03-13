package academy.codechosun.character;

public class Human {
    private String name;
    private float weight;
    private float height;
    private Dog pet;

    public Human(String name) {
        this.name = name;
        this.weight = 73.9f;
        this.height = 173.9f;
    }

    public Dog getPet() {
        return this.pet;
    }

    public void setPet(Dog pet) {
        this.pet = pet;
    }

}

