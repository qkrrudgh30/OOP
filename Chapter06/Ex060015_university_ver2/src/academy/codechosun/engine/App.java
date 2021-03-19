package academy.codechosun.engine;

import academy.codechosun.models.*;

public class App {
    public static void main(String[] args) {
        Student st = new Student("euk", "Park");
        System.out.printf("Email: %s%s", st.getEmail(), System.lineSeparator());

        Teacher teacher = new Teacher("lea", "Park", Department.ELETRONICS);
        System.out.printf("Email: %s%s", teacher.getEmail(), System.lineSeparator());

        Person person = new Person("won", "Kang");
        System.out.printf("Email: %s%s", person.getEmail(), System.lineSeparator());
        
    }

}



