package academy.codechosun.engine;

import academy.codechosun.models.*;

public class App {
    public static void main(String[] args) {
        PartTimeTeacher partTime = new PartTimeTeacher("hang", "bok", Department.COMPUTERENGINEERING, 10);

        FullTimeTeacher fullTime = new FullTimeTeacher("eun", "soo", Department.MATHMATICS);
        fullTime.setOfficeNumber(101);

        Teacher teacher = new Teacher("thy", "A", Department.ELETRONICS);
        
    }

}



