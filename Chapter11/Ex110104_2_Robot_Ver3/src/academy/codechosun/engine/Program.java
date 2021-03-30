package academy.codechosun.engine;

import academy.codechosun.models.Robot;

public class Program {
    public static void main(String[] args) {
        Robot robot = new Robot(300);
        robot.damage(50);
        System.out.println(robot.getHp());

        Robot savePoint = (Robot)robot.clone();
        robot.damage(50);
        System.out.println(robot.getHp());
        System.out.println(savePoint.getHp());
        System.out.println(robot == savePoint);

        System.out.println(savePoint.getHead() == robot.getHead());


    }

}
