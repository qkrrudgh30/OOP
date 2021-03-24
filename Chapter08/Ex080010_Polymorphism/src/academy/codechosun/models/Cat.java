package academy.codechosun.models;

public class Cat extends Pet {
    public Cat(int age, String name) {
        super(age, name);
    }

    public void attack() {
        System.out.println("Claw!");
    }

    public void meow() {
        System.out.println("Meow~");
    }

}

