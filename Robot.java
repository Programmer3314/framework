public class Robot extends RobotBase {
    public void init() {
        //System.out.println("init");
        C1 c1=new C1();
        cmds.add(c1);
    }

    public void periodic() {
        //System.out.println("periodic");
    }

    public void disabled() {
        //System.out.println("disabled");
    }
}
