package academy.codechosun.engine;

import academy.codechosun.models.*;

public class App {
    public static void main(String[] args) {
        Person person = new PartTimeTeacher("soo", "Park", Department.COMPUTERENGINEERING, 101);

        if (person instanceof PartTimeTeacher) {
            System.out.println("I'm a part-time teacher.");
        }

        if (person instanceof Teacher) {
            System.out.println("I'm a teacher.");
        }
        
    }

}



