import at.htl.robot.model.*;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        /*robot.setX(0);
        robot.setY(0);
        robot.setDirection(Direction.SOUTH);*/

        robot.stepForward();
        robot.stepForward();
        System.out.println("("+robot.getX()+", "+robot.getY()+")");

        robot.rotateLeft();
        robot.rotateLeft();
        robot.stepForward();
        System.out.println("("+robot.getX()+", "+robot.getY()+")");
    }

}
