package academy.codechosun.character;

public class Human {
    public String name;
    float weight;

    public void walk() {
        this.weight -= 1;
    }

    public void eat() {
        this.weight += 1;
    }

    public void speak() {
        System.out.println("Hello!");
    }

}

