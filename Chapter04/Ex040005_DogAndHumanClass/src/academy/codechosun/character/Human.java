package academy.codechosun.character;

public class Human {
    private String name;
    private int age;
    private Dog puppy;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void pat(Dog puppy) {
        this.puppy = puppy;
    }

}



