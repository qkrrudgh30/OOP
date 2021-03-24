package academy.codechosun.models;

public class Dog extends Pet {
    public Dog(int age, String name) {
        super(age, name);
    }

    public void attack() {
        System.out.println("Bite!");
    }

    public void bark() {
        System.out.println("Bow wow!");
    }

}





