public class Robot extends RobotBase {
    public void init() {
        System.out.println("init");
    }

    public void periodic() {
        System.out.println("periodic");
    }

    public void disabled() {
        System.out.println("disabled");
    }
}
