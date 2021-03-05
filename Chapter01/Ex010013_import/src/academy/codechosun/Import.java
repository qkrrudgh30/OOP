package academy.codechosun;

import java.util.Random;

public class Import {
    public static void main(String[] args) {
        Random random_number = new Random();

        System.out.printf("Today's your lucky number is %d.%s", random_number.nextInt(50), System.lineSeparator());

    }
}
