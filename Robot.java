import java.util.Scanner;

public class Robot extends RobotBase {
    Scanner input = new Scanner(System.in);
    int number;
    NumCommand c1;
    public void init() {
        System.out.println("init");
        number = input.nextInt();
        c1 = new NumCommand(number);
        cmds.add(c1);
    }

    public void periodic() {
     //   System.out.println("periodic");
    }

    public void disabled() {
        System.out.println("disabled");
    }
}
