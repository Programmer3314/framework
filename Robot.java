import java.util.Scanner;

public class Robot extends RobotBase {
    Scanner input = new Scanner(System.in);
    int number;
    NumCommand c1;
    NumCommand c2;
    NumCommand c3;
    public void init() {
        System.out.println("Enter start:");
        number = input.nextInt();
        c1 = new NumCommand(number, 1);
        c2 = new NumCommand(number, 2);
        c3 = new NumCommand(number, 3);
        
        cmds.add(c1);
        cmds.add(c2);
        cmds.add(c3);
        
    }

    public void periodic() {
     //   System.out.println("periodic");
     if (!c1.commandIsFinished) {
        System.out.println();
     }
    }

    public void disabled() {
        System.out.println();
        System.out.println("All Done!");
    }
}
