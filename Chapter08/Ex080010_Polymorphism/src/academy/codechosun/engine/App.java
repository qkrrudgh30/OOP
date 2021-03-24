package academy.codechosun.engine;

import java.util.ArrayList;
import academy.codechosun.models.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();

        pets.add(new Dog(3, "Choco"));
        pets.add(new Dog(2, "Jin"));
        pets.add(new Cat(4, "Mow"));
        pets.add(new Dog(1, "Cho"));

        for (Pet pet : pets) {
            pet.attack();
        }

    }

}



