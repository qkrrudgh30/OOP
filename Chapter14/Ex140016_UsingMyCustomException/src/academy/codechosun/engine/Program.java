package academy.codechosun.engine;

import academy.codechosun.database.DB;
import academy.codechosun.exception.UserNotFoundException;

public class Program {
    public static void main(String[] args) {
        DB db = new DB();

        db.findUser("Park");

    }

}




