package academy.codechosun.engine;

import academy.codechosun.models.*;

public class App {
    public static void main(String[] args) {
        Student st1 = new Student("euk", "Park");

        st1.setMajor(Major.ELETRONICS);
        System.out.printf("Name: %s.%s", st1.getFullName(), System.lineSeparator());

        Teacher teacher = new Teacher("lea", "Park", Department.ELETRONICS);
        System.out.printf("Name: %s.%s", teacher.getFullName(), System.lineSeparator());
        System.out.printf("Department: %s.%s", teacher.getDepartment(), System.lineSeparator());

        Person person = new Person("won", "Kang");
        System.out.printf("Name: %s.%s", person.getFullName(), System.lineSeparator());
        // Major majorOfPerson = person.getMajorOrNull(); this does not compile

    }

}



