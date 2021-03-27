package academy.codechosun.engine;

import academy.codechosun.models.*;

public class Program {
    public static void main(String[] args) {
        final int COUNT = 4;
        Animal[] pets = new Animal[COUNT];

        pets[0] = new Bird();
        pets[1] = new Cat();
        pets[2] = new Dog();
        pets[3] = new Animal();

        for (int i = 0; i < COUNT; ++i) {
            pets[i].shout();
        }

        pets[1].purr();

    }

}



