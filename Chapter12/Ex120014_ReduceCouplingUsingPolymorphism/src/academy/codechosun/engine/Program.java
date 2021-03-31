package academy.codechosun.engine;

import academy.codechosun.models.*;

public class Program {
    public static void main(String[] args) {
        SimpleHead head1 = new SimpleHead();
        Robot robot1 = new Robot(300, head1);

        SmartHead head2 = new SmartHead();
        Robot robot2 = new Robot(300, head2);

    }

}
